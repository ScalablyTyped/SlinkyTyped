package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder ()
  extends typingsSlinky.winrt.Windows.Storage.DownloadsFolder
/* static members */
object DownloadsFolder {
  
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  @JSGlobal("Windows.Storage.DownloadsFolder.createFileAsync")
  @js.native
  def createFileAsync(desiredName: String, option: typingsSlinky.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFolder] = js.native
  @JSGlobal("Windows.Storage.DownloadsFolder.createFolderAsync")
  @js.native
  def createFolderAsync(desiredName: String, option: typingsSlinky.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFolder] = js.native
}
