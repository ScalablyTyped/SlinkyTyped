package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreExceptionsMod.TransportError
import typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsSlinky.sipJs.messagesMod.URI
import typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingRequestMod {
  
  @js.native
  trait IncomingRequest extends StObject {
    
    /**
      * Send a 2xx positive final response to this request. Defaults to 200.
      * @param options - Response options bucket.
      */
    def accept(): OutgoingResponse = js.native
    def accept(options: ResponseOptions): OutgoingResponse = js.native
    
    /** Delegate providing custom handling of this incoming request. */
    var delegate: js.UndefOr[IncomingRequestDelegate] = js.native
    
    /** The incoming message. */
    val message: IncomingRequestMessage = js.native
    
    /**
      * Send a 1xx provisional response to this request. Defaults to 180. Excludes 100.
      * Note that per RFC 4320, this method may only be used to respond to INVITE requests.
      * @param options - Response options bucket.
      */
    def progress(): OutgoingResponse = js.native
    def progress(options: ResponseOptions): OutgoingResponse = js.native
    
    /**
      * Send a 3xx negative final response to this request. Defaults to 302.
      * @param contacts - Contacts to redirect the UAC to.
      * @param options - Response options bucket.
      */
    def redirect(contacts: js.Array[URI]): OutgoingResponse = js.native
    def redirect(contacts: js.Array[URI], options: ResponseOptions): OutgoingResponse = js.native
    
    /**
      * Send a 4xx, 5xx, or 6xx negative final response to this request. Defaults to 480.
      * @param options -  Response options bucket.
      */
    def reject(): OutgoingResponse = js.native
    def reject(options: ResponseOptions): OutgoingResponse = js.native
    
    /**
      * Send a 100 outgoing response to this request.
      * @param options - Response options bucket.
      */
    def trying(): OutgoingResponse = js.native
    def trying(options: ResponseOptions): OutgoingResponse = js.native
  }
  
  @js.native
  trait IncomingRequestDelegate extends StObject {
    
    /**
      * Receive CANCEL request.
      * https://tools.ietf.org/html/rfc3261#section-9.2
      * Note: Currently CANCEL is being handled as a special case.
      * No UAS is created to handle the CANCEL and the response to
      * it CANCEL is being handled statelessly by the user agent core.
      * As such, there is currently no way to externally impact the
      * response to the a CANCEL request and thus the method here is
      * receiving a "message" (as apposed to a "uas").
      * @param message - Incoming CANCEL request message.
      */
    var onCancel: js.UndefOr[js.Function1[/* message */ IncomingRequestMessage, Unit]] = js.native
    
    /**
      * A transport error occurred attempted to send a response.
      * @param error - Transport error.
      */
    var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.native
  }
  object IncomingRequestDelegate {
    
    @scala.inline
    def apply(): IncomingRequestDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncomingRequestDelegate]
    }
    
    @scala.inline
    implicit class IncomingRequestDelegateMutableBuilder[Self <: IncomingRequestDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCancel(value: /* message */ IncomingRequestMessage => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnTransportError(value: /* error */ TransportError => Unit): Self = StObject.set(x, "onTransportError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransportErrorUndefined: Self = StObject.set(x, "onTransportError", js.undefined)
    }
  }
}
