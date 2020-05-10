package typingsSlinky.sipJs.userAgentCoreDelegateMod

import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import typingsSlinky.sipJs.methodsMessageMod.IncomingMessageRequest
import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import typingsSlinky.sipJs.registerMod.IncomingRegisterRequest
import typingsSlinky.sipJs.subscribeMod.IncomingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentCoreDelegate extends js.Object {
  /**
    * Receive INVITE request.
    * @param request - Incoming INVITE request.
    */
  var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.native
  /**
    * Receive MESSAGE request.
    * @param request - Incoming MESSAGE request.
    */
  var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.native
  /**
    * DEPRECATED. Receive NOTIFY request.
    * @param message - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.native
  /**
    * Receive REFER request.
    * @param request - Incoming REFER request.
    */
  var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
  /**
    * Receive REGISTER request.
    * @param request - Incoming REGISTER request.
    */
  var onRegister: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.native
  /**
    * Receive SUBSCRIBE request.
    * @param request - Incoming SUBSCRIBE request.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.native
}

object UserAgentCoreDelegate {
  @scala.inline
  def apply(): UserAgentCoreDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentCoreDelegate]
  }
  @scala.inline
  implicit class UserAgentCoreDelegateOps[Self <: UserAgentCoreDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnMessage(value: /* request */ IncomingMessageRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
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
    @scala.inline
    def withOnRegister(value: /* request */ IncomingRegisterRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscribe(value: /* request */ IncomingSubscribeRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.undefined)
        ret
    }
  }
  
}

