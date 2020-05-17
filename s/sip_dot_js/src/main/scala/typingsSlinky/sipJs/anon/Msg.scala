package typingsSlinky.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Msg extends js.Object {
  var msg: String = js.native
  var overrideEvent: js.UndefOr[Boolean] = js.native
}

object Msg {
  @scala.inline
  def apply(msg: String): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  @scala.inline
  implicit class MsgOps[Self <: Msg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideEvent")(js.undefined)
        ret
    }
  }
  
}

