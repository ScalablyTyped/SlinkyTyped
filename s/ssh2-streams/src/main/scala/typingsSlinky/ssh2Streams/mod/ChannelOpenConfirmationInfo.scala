package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOpenConfirmationInfo extends js.Object {
  var packetSize: Double = js.native
  var recipient: Double = js.native
  var sender: Double = js.native
  var window: Double = js.native
}

object ChannelOpenConfirmationInfo {
  @scala.inline
  def apply(packetSize: Double, recipient: Double, sender: Double, window: Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
  @scala.inline
  implicit class ChannelOpenConfirmationInfoOps[Self <: ChannelOpenConfirmationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPacketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

