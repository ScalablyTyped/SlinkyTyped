package typingsSlinky.sipJs

import org.scalajs.dom.experimental.webrtc.RTCDataChannelEvent
import org.scalajs.dom.experimental.webrtc.RTCPeerConnectionIceEvent
import org.scalajs.dom.raw.Event
import typingsSlinky.std.RTCPeerConnectionIceErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerConnectionDelegateMod {
  
  @js.native
  trait PeerConnectionDelegate extends StObject {
    
    /**
      * This happens whenever the aggregate state of the connection changes.
      * The aggregate state is a combination of the states of all of the
      * individual network transports being used by the connection.
      * @param event - Event.
      */
    var onconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when an RTCDataChannel is added to the connection by the
      * remote peer calling createDataChannel().
      * @param event - RTCDataChannelEvent.
      */
    var ondatachannel: js.UndefOr[js.Function1[/* event */ RTCDataChannelEvent, Unit]] = js.native
    
    /**
      * Triggered when a new ICE candidate has been found.
      * @param event - RTCPeerConnectionIceEvent.
      */
    var onicecandidate: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceEvent, Unit]] = js.native
    
    /**
      * Triggered when an error occurred during ICE candidate gathering.
      * @param event - RTCPeerConnectionIceErrorEvent.
      */
    var onicecandidateerror: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceErrorEvent, Unit]] = js.native
    
    /**
      * This happens whenever the local ICE agent needs to deliver a message to
      * the other peer through the signaling server. This lets the ICE agent
      * perform negotiation with the remote peer without the browser itself
      * needing to know any specifics about the technology being used for
      * signalingTriggered when the IceConnectionState changes.
      * @param event - Event.
      */
    var oniceconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when the ICE gathering state changes.
      * @param event - Event.
      */
    var onicegatheringstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when renegotiation is necessary.
      * @param event - Event.
      */
    var onnegotiationneeded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when the SignalingState changes.
      * @param event - Event.
      */
    var onsignalingstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when when a statistics object being monitored is deleted.
      * @param event - Event.
      */
    var onstatsended: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * Triggered when a new track is signaled by the remote peer, as a result of setRemoteDescription.
      * @param event - Event.
      */
    var ontrack: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  }
  object PeerConnectionDelegate {
    
    @scala.inline
    def apply(): PeerConnectionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerConnectionDelegate]
    }
    
    @scala.inline
    implicit class PeerConnectionDelegateMutableBuilder[Self <: PeerConnectionDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnconnectionstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onconnectionstatechange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnconnectionstatechangeUndefined: Self = StObject.set(x, "onconnectionstatechange", js.undefined)
      
      @scala.inline
      def setOndatachannel(value: /* event */ RTCDataChannelEvent => Unit): Self = StObject.set(x, "ondatachannel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndatachannelUndefined: Self = StObject.set(x, "ondatachannel", js.undefined)
      
      @scala.inline
      def setOnicecandidate(value: /* event */ RTCPeerConnectionIceEvent => Unit): Self = StObject.set(x, "onicecandidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnicecandidateUndefined: Self = StObject.set(x, "onicecandidate", js.undefined)
      
      @scala.inline
      def setOnicecandidateerror(value: /* event */ RTCPeerConnectionIceErrorEvent => Unit): Self = StObject.set(x, "onicecandidateerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnicecandidateerrorUndefined: Self = StObject.set(x, "onicecandidateerror", js.undefined)
      
      @scala.inline
      def setOniceconnectionstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "oniceconnectionstatechange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOniceconnectionstatechangeUndefined: Self = StObject.set(x, "oniceconnectionstatechange", js.undefined)
      
      @scala.inline
      def setOnicegatheringstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onicegatheringstatechange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnicegatheringstatechangeUndefined: Self = StObject.set(x, "onicegatheringstatechange", js.undefined)
      
      @scala.inline
      def setOnnegotiationneeded(value: /* event */ Event => Unit): Self = StObject.set(x, "onnegotiationneeded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnnegotiationneededUndefined: Self = StObject.set(x, "onnegotiationneeded", js.undefined)
      
      @scala.inline
      def setOnsignalingstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onsignalingstatechange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnsignalingstatechangeUndefined: Self = StObject.set(x, "onsignalingstatechange", js.undefined)
      
      @scala.inline
      def setOnstatsended(value: /* event */ Event => Unit): Self = StObject.set(x, "onstatsended", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnstatsendedUndefined: Self = StObject.set(x, "onstatsended", js.undefined)
      
      @scala.inline
      def setOntrack(value: /* event */ Event => Unit): Self = StObject.set(x, "ontrack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntrackUndefined: Self = StObject.set(x, "ontrack", js.undefined)
    }
  }
}
