package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberDeleteResposne extends js.Object {
  var del_count: Double = js.native
  var message: success = js.native
}

object ListMemberDeleteResposne {
  @scala.inline
  def apply(del_count: Double, message: success): ListMemberDeleteResposne = {
    val __obj = js.Dynamic.literal(del_count = del_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberDeleteResposne]
  }
  @scala.inline
  implicit class ListMemberDeleteResposneOps[Self <: ListMemberDeleteResposne] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDel_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

