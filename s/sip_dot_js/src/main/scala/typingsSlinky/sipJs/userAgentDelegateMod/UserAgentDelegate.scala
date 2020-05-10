package typingsSlinky.sipJs.userAgentDelegateMod

import typingsSlinky.sipJs.invitationMod.Invitation
import typingsSlinky.sipJs.messageMod.Message
import typingsSlinky.sipJs.notificationMod.Notification
import typingsSlinky.sipJs.referralMod.Referral
import typingsSlinky.sipJs.registerMod.IncomingRegisterRequest
import typingsSlinky.sipJs.subscribeMod.IncomingSubscribeRequest
import typingsSlinky.sipJs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentDelegate extends js.Object {
  /**
    * Called upon transport transitioning to connected state.
    */
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called upon transport transitioning from connected state.
    * @param error - An error if disconnect triggered by transport. Otherwise undefined.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.native
  /**
    * Called upon receipt of an invitation.
    * @remarks
    * Handler for incoming out of dialog INVITE requests.
    * @param invitation - The invitation.
    */
  var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.native
  /**
    * Called upon receipt of a message.
    * @remarks
    * Handler for incoming out of dialog MESSAGE requests.
    * @param message - The message.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.native
  /**
    * Called upon receipt of a notification.
    * @remarks
    * Handler for incoming out of dialog NOTIFY requests.
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.native
  /**
    * Called upon receipt of a referral.
    * @remarks
    * Handler for incoming out of dialog REFER requests.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.native
  /**
    * @internal
    * Called upon receipt of a registration request. Used by test suite.
    * @param request - The request.
    */
  var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.native
  /**
    * Called upon receipt of a subscription.
    * @remarks
    * Handler for incoming out of dialog SUBSCRIBE requests.
    * @param subscription - The subscription.
    */
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.native
  /**
    * @internal
    * Called upon receipt of a subscription request. Used by test suite.
    * @param request - The request.
    */
  var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.native
}

object UserAgentDelegate {
  @scala.inline
  def apply(): UserAgentDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentDelegate]
  }
  @scala.inline
  implicit class UserAgentDelegateOps[Self <: UserAgentDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnect(value: /* error */ js.UndefOr[js.Error] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvite(value: /* invitation */ Invitation => Unit): Self = {
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
    def withOnMessage(value: /* message */ Message => Unit): Self = {
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
    def withOnNotify(value: /* notification */ Notification => Unit): Self = {
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
    def withOnRefer(value: /* referral */ Referral => Unit): Self = {
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
    def withOnRegisterRequest(value: /* request */ IncomingRegisterRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegisterRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegisterRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegisterRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscribe(value: /* subscription */ Subscription => Unit): Self = {
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
    @scala.inline
    def withOnSubscribeRequest(value: /* request */ IncomingSubscribeRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubscribeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribeRequest")(js.undefined)
        ret
    }
  }
  
}

