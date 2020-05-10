package typingsSlinky.stompit.socketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  var commandHandlers: js.UndefOr[CommandHandlers] = js.native
  var heartbeat: js.UndefOr[Heartbeat] = js.native
  var heartbeatDelayMargin: js.UndefOr[Double] = js.native
  var heartbeatOutputMargin: js.UndefOr[Double] = js.native
  var outgoingFrameStream: js.UndefOr[typingsSlinky.stompit.outgoingFrameStreamMod.^] = js.native
  var resetDisconnect: js.UndefOr[Boolean] = js.native
  var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandHandlers(value: CommandHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeat(value: Heartbeat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatDelayMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatDelayMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatDelayMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatDelayMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatOutputMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatOutputMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatOutputMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatOutputMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingFrameStream(value: typingsSlinky.stompit.outgoingFrameStreamMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingFrameStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingFrameStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingFrameStream")(js.undefined)
        ret
    }
    @scala.inline
    def withResetDisconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownCommand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownCommand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnknownCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownCommand")(js.undefined)
        ret
    }
  }
  
}

