package typingsSlinky.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Always extends js.Object {
  var always: String = js.native
  var no_push_msg_received: js.UndefOr[String] = js.native
}

object Always {
  @scala.inline
  def apply(always: String): Always = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  @scala.inline
  implicit class AlwaysOps[Self <: Always] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNo_push_msg_received(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_push_msg_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_push_msg_received: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_push_msg_received")(js.undefined)
        ret
    }
  }
  
}

