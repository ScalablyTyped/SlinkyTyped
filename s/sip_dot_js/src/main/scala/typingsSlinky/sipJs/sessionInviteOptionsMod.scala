package typingsSlinky.sipJs

import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionInviteOptionsMod {
  
  @js.native
  trait SessionInviteOptions extends StObject {
    
    /**
      * See `core` API.
      */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
    
    /**
      * See `core` API.
      */
    var requestOptions: js.UndefOr[RequestOptions] = js.native
    
    /**
      * Modifiers to pass to SessionDescriptionHandler during re-INVITE transaction.
      */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
    
    /**
      * Options to pass to SessionDescriptionHandler during re-INVITE transaction.
      */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
    
    /**
      * If true, send INVITE without SDP. Default is false.
      */
    var withoutSdp: js.UndefOr[Boolean] = js.native
  }
  object SessionInviteOptions {
    
    @scala.inline
    def apply(): SessionInviteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionInviteOptions]
    }
    
    @scala.inline
    implicit class SessionInviteOptionsMutableBuilder[Self <: SessionInviteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value :_*))
      
      @scala.inline
      def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
      
      @scala.inline
      def setWithoutSdp(value: Boolean): Self = StObject.set(x, "withoutSdp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutSdpUndefined: Self = StObject.set(x, "withoutSdp", js.undefined)
    }
  }
}
