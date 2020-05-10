package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSessionCustomEvent extends js.Object {
  /**
  		 * Event specific information.
  		 */
  val body: js.UndefOr[js.Any] = js.native
  /**
  		 * Type of event.
  		 */
  val event: String = js.native
  /**
  		 * The [debug session](#DebugSession) for which the custom event was received.
  		 */
  val session: DebugSession = js.native
}

object DebugSessionCustomEvent {
  @scala.inline
  def apply(event: String, session: DebugSession): DebugSessionCustomEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSessionCustomEvent]
  }
  @scala.inline
  implicit class DebugSessionCustomEventOps[Self <: DebugSessionCustomEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: DebugSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

