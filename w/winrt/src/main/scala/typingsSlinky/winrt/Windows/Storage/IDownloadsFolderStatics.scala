package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadsFolderStatics extends js.Object {
  
  def createFileAsync(desiredName: String): IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFile] = js.native
  
  def createFolderAsync(desiredName: String): IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: String, option: CreationCollisionOption): IAsyncOperation[StorageFolder] = js.native
}
