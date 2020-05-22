package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileManagerStatics extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus]
  def deferUpdates(file: IStorageFile): Unit
}

object ICachedFileManagerStatics {
  @scala.inline
  def apply(
    completeUpdatesAsync: IStorageFile => IAsyncOperation[FileUpdateStatus],
    deferUpdates: IStorageFile => Unit
  ): ICachedFileManagerStatics = {
    val __obj = js.Dynamic.literal(completeUpdatesAsync = js.Any.fromFunction1(completeUpdatesAsync), deferUpdates = js.Any.fromFunction1(deferUpdates))
    __obj.asInstanceOf[ICachedFileManagerStatics]
  }
}

