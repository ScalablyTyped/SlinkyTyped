package typingsSlinky.sipJs

import typingsSlinky.sipJs.invitationMod.Invitation
import typingsSlinky.sipJs.messageMod.Message
import typingsSlinky.sipJs.notificationMod.Notification
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import typingsSlinky.sipJs.referralMod.Referral
import typingsSlinky.sipJs.registerMod.IncomingRegisterRequest
import typingsSlinky.sipJs.subscribeMod.IncomingSubscribeRequest
import typingsSlinky.sipJs.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentDelegateMod {
  
  @js.native
  trait UserAgentDelegate extends StObject {
    
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
      * @alpha
      * Called upon receipt of a referral.
      * @remarks
      * Handler for incoming out of dialog REFER requests.
      * @param referral - The referral.
      */
    var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.native
    
    /**
      * @internal
      * Called upon receipt of an out of dialog REFER. Used by test suite.
      * @param request - The request.
      */
    var onReferRequest: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.native
    
    /**
      * @alpha
      * Called upon receipt of a registration.
      * @remarks
      * Handler for incoming out of dialog REGISTER requests.
      * @param registration - The registration.
      */
    var onRegister: js.UndefOr[js.Function1[/* registration */ js.Any, Unit]] = js.native
    
    /**
      * @internal
      * Called upon receipt of a REGISTER request. Used by test suite.
      * @param request - The request.
      */
    var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.native
    
    /**
      * @alpha
      * Called upon receipt of a subscription.
      * @remarks
      * Handler for incoming out of dialog SUBSCRIBE requests.
      * @param subscription - The subscription.
      */
    var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.native
    
    /**
      * @internal
      * Called upon receipt of an out of dialog SUBSCRIBE request. Used by test suite.
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
    implicit class UserAgentDelegateMutableBuilder[Self <: UserAgentDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnConnect(value: () => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      @scala.inline
      def setOnDisconnect(value: /* error */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      @scala.inline
      def setOnInvite(value: /* invitation */ Invitation => Unit): Self = StObject.set(x, "onInvite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      @scala.inline
      def setOnMessage(value: /* message */ Message => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnNotify(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      @scala.inline
      def setOnRefer(value: /* referral */ Referral => Unit): Self = StObject.set(x, "onRefer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReferRequest(value: /* request */ IncomingReferRequest => Unit): Self = StObject.set(x, "onReferRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReferRequestUndefined: Self = StObject.set(x, "onReferRequest", js.undefined)
      
      @scala.inline
      def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      @scala.inline
      def setOnRegister(value: /* registration */ js.Any => Unit): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRegisterRequest(value: /* request */ IncomingRegisterRequest => Unit): Self = StObject.set(x, "onRegisterRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRegisterRequestUndefined: Self = StObject.set(x, "onRegisterRequest", js.undefined)
      
      @scala.inline
      def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      @scala.inline
      def setOnSubscribe(value: /* subscription */ Subscription => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribeRequest(value: /* request */ IncomingSubscribeRequest => Unit): Self = StObject.set(x, "onSubscribeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribeRequestUndefined: Self = StObject.set(x, "onSubscribeRequest", js.undefined)
      
      @scala.inline
      def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
