package typingsSlinky.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatedEventArgs extends js.Object {
  var channel: typingsSlinky.twilioChat.channelMod.Channel = js.native
  var updateReasons: js.Array[UpdateReason] = js.native
}

object UpdatedEventArgs {
  @scala.inline
  def apply(channel: typingsSlinky.twilioChat.channelMod.Channel, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedEventArgs]
  }
  @scala.inline
  implicit class UpdatedEventArgsOps[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: typingsSlinky.twilioChat.channelMod.Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReasons(value: js.Array[UpdateReason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReasons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

