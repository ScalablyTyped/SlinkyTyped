package typingsSlinky.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatedEventArgs extends js.Object {
  var updateReasons: js.Array[UpdateReason] = js.native
  var user: typingsSlinky.twilioChat.userMod.User = js.native
}

object UpdatedEventArgs {
  @scala.inline
  def apply(updateReasons: js.Array[UpdateReason], user: typingsSlinky.twilioChat.userMod.User): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedEventArgs]
  }
  @scala.inline
  implicit class UpdatedEventArgsOps[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateReasons(value: js.Array[UpdateReason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: typingsSlinky.twilioChat.userMod.User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

