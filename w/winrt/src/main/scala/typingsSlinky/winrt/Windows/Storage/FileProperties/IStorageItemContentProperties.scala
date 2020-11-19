package typingsSlinky.winrt.Windows.Storage.FileProperties

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItemContentProperties extends IStorageItemExtraProperties {
  
  def getDocumentPropertiesAsync(): IAsyncOperation[DocumentProperties] = js.native
  
  def getImagePropertiesAsync(): IAsyncOperation[ImageProperties] = js.native
  
  def getMusicPropertiesAsync(): IAsyncOperation[MusicProperties] = js.native
  
  def getVideoPropertiesAsync(): IAsyncOperation[VideoProperties] = js.native
}
