package typingsSlinky.sipJs.inviteMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingInviteRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response (including a confirmed Session).
    */
  @JSName("onAccept")
  var onAccept_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ AckableIncomingResponseWithSession, Unit]] = js.native
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response (including an early Session).
    */
  @JSName("onProgress")
  var onProgress_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ PrackableIncomingResponseWithSession, Unit]] = js.native
}

object OutgoingInviteRequestDelegate {
  @scala.inline
  def apply(): OutgoingInviteRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingInviteRequestDelegate]
  }
  @scala.inline
  implicit class OutgoingInviteRequestDelegateOps[Self <: OutgoingInviteRequestDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAccept(value: /* response */ AckableIncomingResponseWithSession => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* response */ PrackableIncomingResponseWithSession => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
  }
  
}

