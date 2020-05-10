package typingsSlinky.sipJs.sessionSessionDelegateMod

import typingsSlinky.sipJs.ackMod.IncomingAckRequest
import typingsSlinky.sipJs.byeMod.IncomingByeRequest
import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import typingsSlinky.sipJs.methodsInfoMod.IncomingInfoRequest
import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.prackMod.IncomingPrackRequest
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDelegate extends js.Object {
  /**
    * Receive ACK request.
    * @param request - Incoming ACK request.
    */
  var onAck: js.UndefOr[js.Function1[/* request */ IncomingAckRequest, Unit]] = js.native
  /**
    * Timeout waiting for ACK request.
    * If no handler is provided the Session will terminated with a BYE.
    * https://tools.ietf.org/html/rfc3261#section-13.3.1.4
    */
  var onAckTimeout: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Receive BYE request.
    * https://tools.ietf.org/html/rfc3261#section-15.1.2
    * @param request - Incoming BYE request.
    */
  var onBye: js.UndefOr[js.Function1[/* request */ IncomingByeRequest, Unit]] = js.native
  /**
    * Receive INFO request.
    * @param request - Incoming INFO request.
    */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingInfoRequest, Unit]] = js.native
  /**
    * Receive re-INVITE request.
    * https://tools.ietf.org/html/rfc3261#section-14.2
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.native
  /**
    * Receive NOTIFY request.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.native
  /**
    * Receive PRACK request.
    * https://tools.ietf.org/html/rfc3262#section-3
    * @param request - Incoming PRACK request.
    */
  var onPrack: js.UndefOr[js.Function1[/* request */ IncomingPrackRequest, Unit]] = js.native
  /**
    * Receive REFER request.
    * https://tools.ietf.org/html/rfc3515#section-2.4.2
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
}

object SessionDelegate {
  @scala.inline
  def apply(): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDelegate]
  }
  @scala.inline
  implicit class SessionDelegateOps[Self <: SessionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAck(value: /* request */ IncomingAckRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAck")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAckTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAckTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAckTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBye(value: /* request */ IncomingByeRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBye")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBye: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBye")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInfo(value: /* request */ IncomingInfoRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvite(value: /* request */ IncomingInviteRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvite")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrack(value: /* request */ IncomingPrackRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrack")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefer(value: /* request */ IncomingReferRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefer")(js.undefined)
        ret
    }
  }
  
}

