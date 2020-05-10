package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOpenFailureInfo extends js.Object {
  var description: String = js.native
  var reason: String = js.native
  var reasonCode: Double = js.native
  var recipient: Double = js.native
}

object ChannelOpenFailureInfo {
  @scala.inline
  def apply(description: String, reason: String, reasonCode: Double, recipient: Double): ChannelOpenFailureInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonCode = reasonCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenFailureInfo]
  }
  @scala.inline
  implicit class ChannelOpenFailureInfoOps[Self <: ChannelOpenFailureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

