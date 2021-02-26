package typingsSlinky.sipJs

import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import typingsSlinky.sipJs.methodsMessageMod.IncomingMessageRequest
import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.referMod.IncomingReferRequest
import typingsSlinky.sipJs.registerMod.IncomingRegisterRequest
import typingsSlinky.sipJs.subscribeMod.IncomingSubscribeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentCoreDelegateMod {
  
  @js.native
  trait UserAgentCoreDelegate extends StObject {
    
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
    implicit class UserAgentCoreDelegateMutableBuilder[Self <: UserAgentCoreDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnInvite(value: /* request */ IncomingInviteRequest => Unit): Self = StObject.set(x, "onInvite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      @scala.inline
      def setOnMessage(value: /* request */ IncomingMessageRequest => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      @scala.inline
      def setOnRefer(value: /* request */ IncomingReferRequest => Unit): Self = StObject.set(x, "onRefer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      @scala.inline
      def setOnRegister(value: /* request */ IncomingRegisterRequest => Unit): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      @scala.inline
      def setOnSubscribe(value: /* request */ IncomingSubscribeRequest => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
