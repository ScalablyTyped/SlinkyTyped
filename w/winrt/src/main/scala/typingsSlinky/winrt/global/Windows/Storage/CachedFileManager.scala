package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
class CachedFileManager ()
  extends typingsSlinky.winrt.Windows.Storage.CachedFileManager

/* static members */
@JSGlobal("Windows.Storage.CachedFileManager")
@js.native
object CachedFileManager extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
}

