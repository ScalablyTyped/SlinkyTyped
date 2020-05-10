package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolder2 extends js.Object {
  def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem] = js.native
}

object IStorageFolder2 {
  @scala.inline
  def apply(tryGetItemAsync: String => IAsyncOperation[IStorageItem]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal(tryGetItemAsync = js.Any.fromFunction1(tryGetItemAsync))
    __obj.asInstanceOf[IStorageFolder2]
  }
  @scala.inline
  implicit class IStorageFolder2Ops[Self <: IStorageFolder2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTryGetItemAsync(value: String => IAsyncOperation[IStorageItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetItemAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

