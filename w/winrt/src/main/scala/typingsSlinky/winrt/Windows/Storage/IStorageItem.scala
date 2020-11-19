package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.FileProperties.BasicProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItem extends js.Object {
  
  var attributes: FileAttributes = js.native
  
  var dateCreated: js.Date = js.native
  
  def deleteAsync(): IAsyncAction = js.native
  def deleteAsync(option: StorageDeleteOption): IAsyncAction = js.native
  
  def getBasicPropertiesAsync(): IAsyncOperation[BasicProperties] = js.native
  
  def isOfType(`type`: StorageItemTypes): Boolean = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  def renameAsync(desiredName: String): IAsyncAction = js.native
  def renameAsync(desiredName: String, option: NameCollisionOption): IAsyncAction = js.native
}
