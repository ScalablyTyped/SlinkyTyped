package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleUserDelegateMod {
  
  @js.native
  trait SimpleUserDelegate extends StObject {
    
    /**
      * Called when a call is answered.
      * @remarks
      * Callback for handling establishment of a new Session.
      */
    var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when a call is created.
      * @remarks
      * Callback for handling the creation of a new Session.
      */
    var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when a call receives an incoming DTMF tone.
      * @remarks
      * Callback for handling an incoming INFO request with content type application/dtmf-relay.
      */
    var onCallDTMFReceived: js.UndefOr[js.Function2[/* tone */ String, /* duration */ Double, Unit]] = js.native
    
    /**
      * Called when a call is hung up.
      * @remarks
      * Callback for handling termination of a Session.
      */
    var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when a call is put on hold or taken off hold.
      * @remarks
      * Callback for handling re-INVITE responses.
      */
    var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.native
    
    /**
      * Called when a call is received.
      * @remarks
      * Callback for handling incoming INVITE requests.
      * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
      */
    var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called upon receiving a message.
      * @remarks
      * Callback for handling incoming MESSAGE requests.
      * @param message - The message received.
      */
    var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    /**
      * Called when user is registered to received calls.
      */
    var onRegistered: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when user is connected to server.
      * @remarks
      * Callback for handling user becomes connected.
      */
    var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Called when user is no longer connected.
      * @remarks
      * Callback for handling user becomes disconnected.
      *
      * @param error - An Error if server caused the disconnect. Otherwise undefined.
      */
    var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.native
    
    /**
      * Called when user is no longer registered to received calls.
      */
    var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object SimpleUserDelegate {
    
    @scala.inline
    def apply(): SimpleUserDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserDelegate]
    }
    
    @scala.inline
    implicit class SimpleUserDelegateMutableBuilder[Self <: SimpleUserDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCallAnswered(value: () => Unit): Self = StObject.set(x, "onCallAnswered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCallAnsweredUndefined: Self = StObject.set(x, "onCallAnswered", js.undefined)
      
      @scala.inline
      def setOnCallCreated(value: () => Unit): Self = StObject.set(x, "onCallCreated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCallCreatedUndefined: Self = StObject.set(x, "onCallCreated", js.undefined)
      
      @scala.inline
      def setOnCallDTMFReceived(value: (/* tone */ String, /* duration */ Double) => Unit): Self = StObject.set(x, "onCallDTMFReceived", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCallDTMFReceivedUndefined: Self = StObject.set(x, "onCallDTMFReceived", js.undefined)
      
      @scala.inline
      def setOnCallHangup(value: () => Unit): Self = StObject.set(x, "onCallHangup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCallHangupUndefined: Self = StObject.set(x, "onCallHangup", js.undefined)
      
      @scala.inline
      def setOnCallHold(value: /* held */ Boolean => Unit): Self = StObject.set(x, "onCallHold", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCallHoldUndefined: Self = StObject.set(x, "onCallHold", js.undefined)
      
      @scala.inline
      def setOnCallReceived(value: () => Unit): Self = StObject.set(x, "onCallReceived", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCallReceivedUndefined: Self = StObject.set(x, "onCallReceived", js.undefined)
      
      @scala.inline
      def setOnMessageReceived(value: /* message */ String => Unit): Self = StObject.set(x, "onMessageReceived", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessageReceivedUndefined: Self = StObject.set(x, "onMessageReceived", js.undefined)
      
      @scala.inline
      def setOnRegistered(value: () => Unit): Self = StObject.set(x, "onRegistered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRegisteredUndefined: Self = StObject.set(x, "onRegistered", js.undefined)
      
      @scala.inline
      def setOnServerConnect(value: () => Unit): Self = StObject.set(x, "onServerConnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnServerConnectUndefined: Self = StObject.set(x, "onServerConnect", js.undefined)
      
      @scala.inline
      def setOnServerDisconnect(value: /* error */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "onServerDisconnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnServerDisconnectUndefined: Self = StObject.set(x, "onServerDisconnect", js.undefined)
      
      @scala.inline
      def setOnUnregistered(value: () => Unit): Self = StObject.set(x, "onUnregistered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnregisteredUndefined: Self = StObject.set(x, "onUnregistered", js.undefined)
    }
  }
}
