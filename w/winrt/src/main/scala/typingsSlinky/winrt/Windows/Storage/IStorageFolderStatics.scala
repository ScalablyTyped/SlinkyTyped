package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderStatics extends js.Object {
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder] = js.native
}

object IStorageFolderStatics {
  @scala.inline
  def apply(getFolderFromPathAsync: String => IAsyncOperation[StorageFolder]): IStorageFolderStatics = {
    val __obj = js.Dynamic.literal(getFolderFromPathAsync = js.Any.fromFunction1(getFolderFromPathAsync))
    __obj.asInstanceOf[IStorageFolderStatics]
  }
  @scala.inline
  implicit class IStorageFolderStaticsOps[Self <: IStorageFolderStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFolderFromPathAsync(value: String => IAsyncOperation[StorageFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFolderFromPathAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

