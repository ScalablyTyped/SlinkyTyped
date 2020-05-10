package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICachedFileManagerStatics extends js.Object {
  def completeUpdatesAsync(file: IStorageFile): IAsyncOperation[FileUpdateStatus] = js.native
  def deferUpdates(file: IStorageFile): Unit = js.native
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
  @scala.inline
  implicit class ICachedFileManagerStaticsOps[Self <: ICachedFileManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteUpdatesAsync(value: IStorageFile => IAsyncOperation[FileUpdateStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeUpdatesAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeferUpdates(value: IStorageFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdates")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

