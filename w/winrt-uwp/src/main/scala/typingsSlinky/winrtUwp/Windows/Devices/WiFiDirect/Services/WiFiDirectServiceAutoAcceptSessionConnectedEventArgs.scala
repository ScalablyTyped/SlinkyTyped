package typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect.Services

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceAdvertiser.AutoAcceptSessionConnected event is raised. */
@js.native
trait WiFiDirectServiceAutoAcceptSessionConnectedEventArgs extends js.Object {
  /** Gets the WiFiDirectServiceSession that was created when the connection was automatically accepted. */
  var session: WiFiDirectServiceSession = js.native
  /** Gets the session information buffer that corresponds to this automatically accepted connection. */
  var sessionInfo: IBuffer = js.native
}

object WiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
  @scala.inline
  def apply(session: WiFiDirectServiceSession, sessionInfo: IBuffer): WiFiDirectServiceAutoAcceptSessionConnectedEventArgs = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceAutoAcceptSessionConnectedEventArgs]
  }
  @scala.inline
  implicit class WiFiDirectServiceAutoAcceptSessionConnectedEventArgsOps[Self <: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: WiFiDirectServiceSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionInfo(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

