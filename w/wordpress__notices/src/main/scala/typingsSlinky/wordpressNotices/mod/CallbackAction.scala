package typingsSlinky.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackAction extends Action {
  var label: String = js.native
  def callback(): Unit = js.native
}

object CallbackAction {
  @scala.inline
  def apply(callback: () => Unit, label: String): CallbackAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackAction]
  }
  @scala.inline
  implicit class CallbackActionOps[Self <: CallbackAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

