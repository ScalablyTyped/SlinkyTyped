package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
class DownloadsFolder ()
  extends typingsSlinky.winrt.Windows.Storage.DownloadsFolder

/* static members */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
object DownloadsFolder extends js.Object {
  def createFileAsync(desiredName: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def createFileAsync(desiredName: String, option: typingsSlinky.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFile] = js.native
  def createFolderAsync(desiredName: String): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFolder] = js.native
  def createFolderAsync(desiredName: String, option: typingsSlinky.winrt.Windows.Storage.CreationCollisionOption): IAsyncOperation[typingsSlinky.winrt.Windows.Storage.StorageFolder] = js.native
}

