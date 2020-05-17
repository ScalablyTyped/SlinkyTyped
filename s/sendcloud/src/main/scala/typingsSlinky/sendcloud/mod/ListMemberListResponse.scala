package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.anon.Modifyat
import typingsSlinky.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberListResponse extends js.Object {
  var members: js.Array[Modifyat] = js.native
  var message: success = js.native
  var total_count: Double = js.native
}

object ListMemberListResponse {
  @scala.inline
  def apply(members: js.Array[Modifyat], message: success, total_count: Double): ListMemberListResponse = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListResponse]
  }
  @scala.inline
  implicit class ListMemberListResponseOps[Self <: ListMemberListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: js.Array[Modifyat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

