package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialRequestedEventArgs extends js.Object {
  var contact: js.Any = js.native
  def handled(): Unit = js.native
}

object IDialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
  @scala.inline
  implicit class IDialRequestedEventArgsOps[Self <: IDialRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContact(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

