package typingsSlinky.uniApp.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarSearchInputEvent extends js.Object {
  /**
    * 搜索输入框输入内容
    */
  var text: String = js.native
}

object NavigationBarSearchInputEvent {
  @scala.inline
  def apply(text: String): NavigationBarSearchInputEvent = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarSearchInputEvent]
  }
  @scala.inline
  implicit class NavigationBarSearchInputEventOps[Self <: NavigationBarSearchInputEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

