package typingsSlinky.ssh2Streams.mod

import typingsSlinky.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitSignalChannelRequest extends ChannelRequest {
  var coredump: Boolean = js.native
  var description: String = js.native
  var recipient: Double = js.native
  var request: `exit-signal` = js.native
  var signal: String = js.native
}

object ExitSignalChannelRequest {
  @scala.inline
  def apply(coredump: Boolean, description: String, recipient: Double, request: `exit-signal`, signal: String): ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
  @scala.inline
  implicit class ExitSignalChannelRequestOps[Self <: ExitSignalChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoredump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coredump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: `exit-signal`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

