package typingsSlinky.sipJs

import org.scalajs.dom.experimental.webrtc.RTCDataChannel
import org.scalajs.dom.experimental.webrtc.RTCDataChannelInit
import org.scalajs.dom.experimental.webrtc.RTCOfferOptions
import typingsSlinky.std.RTCAnswerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerOptionsMod {
  
  @js.native
  trait SessionDescriptionHandlerOptions
    extends typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
    
    /**
      * Answer options to use when creating an answer.
      */
    var answerOptions: js.UndefOr[RTCAnswerOptions] = js.native
    
    /**
      * If true, create a data channel when making initial offer.
      */
    var dataChannel: js.UndefOr[Boolean] = js.native
    
    /**
      * A human-readable name to use when creating the data channel.
      */
    var dataChannelLabel: js.UndefOr[String] = js.native
    
    /**
      * Configuration options for creating the data channel.
      */
    var dataChannelOptions: js.UndefOr[RTCDataChannelInit] = js.native
    
    /**
      * The maximum duration to wait in ms for ICE gathering to complete.
      * No timeout if undefined or zero.
      */
    var iceGatheringTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Offer options to use when creating an offer.
      */
    var offerOptions: js.UndefOr[RTCOfferOptions] = js.native
    
    /**
      * Called upon creating a data channel.
      */
    var onDataChannel: js.UndefOr[js.Function1[/* dataChannel */ RTCDataChannel, Unit]] = js.native
  }
  object SessionDescriptionHandlerOptions {
    
    @scala.inline
    def apply(): SessionDescriptionHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerOptions]
    }
    
    @scala.inline
    implicit class SessionDescriptionHandlerOptionsMutableBuilder[Self <: SessionDescriptionHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswerOptions(value: RTCAnswerOptions): Self = StObject.set(x, "answerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnswerOptionsUndefined: Self = StObject.set(x, "answerOptions", js.undefined)
      
      @scala.inline
      def setDataChannel(value: Boolean): Self = StObject.set(x, "dataChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataChannelLabel(value: String): Self = StObject.set(x, "dataChannelLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataChannelLabelUndefined: Self = StObject.set(x, "dataChannelLabel", js.undefined)
      
      @scala.inline
      def setDataChannelOptions(value: RTCDataChannelInit): Self = StObject.set(x, "dataChannelOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataChannelOptionsUndefined: Self = StObject.set(x, "dataChannelOptions", js.undefined)
      
      @scala.inline
      def setDataChannelUndefined: Self = StObject.set(x, "dataChannel", js.undefined)
      
      @scala.inline
      def setIceGatheringTimeout(value: Double): Self = StObject.set(x, "iceGatheringTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceGatheringTimeoutUndefined: Self = StObject.set(x, "iceGatheringTimeout", js.undefined)
      
      @scala.inline
      def setOfferOptions(value: RTCOfferOptions): Self = StObject.set(x, "offerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfferOptionsUndefined: Self = StObject.set(x, "offerOptions", js.undefined)
      
      @scala.inline
      def setOnDataChannel(value: /* dataChannel */ RTCDataChannel => Unit): Self = StObject.set(x, "onDataChannel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDataChannelUndefined: Self = StObject.set(x, "onDataChannel", js.undefined)
    }
  }
}
