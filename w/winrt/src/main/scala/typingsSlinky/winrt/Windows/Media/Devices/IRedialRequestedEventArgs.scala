package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRedialRequestedEventArgs extends js.Object {
  def handled(): Unit = js.native
}

object IRedialRequestedEventArgs {
  @scala.inline
  def apply(handled: () => Unit): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
  @scala.inline
  implicit class IRedialRequestedEventArgsOps[Self <: IRedialRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

