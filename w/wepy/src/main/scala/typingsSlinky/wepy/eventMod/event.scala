package typingsSlinky.wepy.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait event extends js.Object {
  var active: Boolean = js.native
  @JSName("$destroy")
  def $destroy(): Unit = js.native
  @JSName("$transfor")
  def $transfor(wxevent: js.Array[_]): Unit = js.native
}

object event {
  @scala.inline
  def apply($destroy: () => Unit, $transfor: js.Array[_] => Unit, active: Boolean): event = {
    val __obj = js.Dynamic.literal($destroy = js.Any.fromFunction0($destroy), $transfor = js.Any.fromFunction1($transfor), active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[event]
  }
  @scala.inline
  implicit class eventOps[Self <: event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$destroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with$transfor(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$transfor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

