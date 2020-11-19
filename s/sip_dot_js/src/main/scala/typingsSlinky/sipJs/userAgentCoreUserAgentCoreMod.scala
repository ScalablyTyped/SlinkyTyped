package typingsSlinky.sipJs

import typingsSlinky.sipJs.bodyMod.Body
import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequest
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.messagesMod.IncomingResponseMessage
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.messagesMod.URI
import typingsSlinky.sipJs.methodsMessageMod.OutgoingMessageRequest
import typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import typingsSlinky.sipJs.publishMod.OutgoingPublishRequest
import typingsSlinky.sipJs.registerMod.OutgoingRegisterRequest
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequest
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typingsSlinky.sipJs.userAgentCoreConfigurationMod.UserAgentCoreConfiguration
import typingsSlinky.sipJs.userAgentCoreDelegateMod.UserAgentCoreDelegate
import typingsSlinky.sipJs.userAgentsMod.SubscribeUserAgentClient
import typingsSlinky.sipJs.userAgentsMod.UserAgentClient
import typingsSlinky.sipJs.userAgentsMod.UserAgentServer
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agent-core/user-agent-core", JSImport.Namespace)
@js.native
object userAgentCoreUserAgentCoreMod extends js.Object {
  
  @js.native
  class UserAgentCore protected () extends js.Object {
    /**
      * Constructor.
      * @param configuration - Configuration.
      * @param delegate - Delegate.
      */
    def this(configuration: UserAgentCoreConfiguration) = this()
    def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
    
    /** Configuration. */
    var configuration: UserAgentCoreConfiguration = js.native
    
    /** Delegate. */
    var delegate: UserAgentCoreDelegate = js.native
    
    /** Dialogs. */
    var dialogs: Map[String, Dialog] = js.native
    
    /** Destructor. */
    def dispose(): Unit = js.native
    
    /**
      * Send INVITE.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def invite(request: OutgoingRequestMessage): OutgoingInviteRequest = js.native
    def invite(request: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate): OutgoingInviteRequest = js.native
    
    var logger: js.Any = js.native
    
    /** Logger factory. */
    def loggerFactory: LoggerFactory = js.native
    
    /**
      * Outgoing request message factory function.
      * @param method - Method.
      * @param requestURI - Request-URI.
      * @param fromURI - From URI.
      * @param toURI - To URI.
      * @param options - Request options.
      * @param extraHeaders - Extra headers to add.
      * @param body - Message body.
      */
    def makeOutgoingRequestMessage(method: String, requestURI: URI, fromURI: URI, toURI: URI, options: OutgoingRequestMessageOptions): OutgoingRequestMessage = js.native
    def makeOutgoingRequestMessage(
      method: String,
      requestURI: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.UndefOr[scala.Nothing],
      body: Body
    ): OutgoingRequestMessage = js.native
    def makeOutgoingRequestMessage(
      method: String,
      requestURI: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ): OutgoingRequestMessage = js.native
    def makeOutgoingRequestMessage(
      method: String,
      requestURI: URI,
      fromURI: URI,
      toURI: URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ): OutgoingRequestMessage = js.native
    
    /**
      * Send MESSAGE.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def message(request: OutgoingRequestMessage): OutgoingMessageRequest = js.native
    def message(request: OutgoingRequestMessage, delegate: OutgoingRequestDelegate): OutgoingMessageRequest = js.native
    
    /**
      * Send PUBLISH.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def publish(request: OutgoingRequestMessage): OutgoingPublishRequest = js.native
    def publish(request: OutgoingRequestMessage, delegate: OutgoingRequestDelegate): OutgoingPublishRequest = js.native
    
    /**
      * Handle an incoming request message from the transport.
      * @param message - Incoming request message from transport layer.
      */
    def receiveIncomingRequestFromTransport(message: IncomingRequestMessage): Unit = js.native
    
    /**
      * Handle an incoming response message from the transport.
      * @param message - Incoming response message from transport layer.
      */
    def receiveIncomingResponseFromTransport(message: IncomingResponseMessage): Unit = js.native
    
    /**
      * Once a dialog has been established between two UAs, either of them
      * MAY initiate new transactions as needed within the dialog.  The UA
      * sending the request will take the UAC role for the transaction.  The
      * UA receiving the request will take the UAS role.  Note that these may
      * be different roles than the UAs held during the transaction that
      * established the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.2
      * @param message - Incoming request message.
      */
    var receiveInsideDialogRequest: js.Any = js.native
    
    /**
      * Assuming all of the checks in the previous subsections are passed,
      * the UAS processing becomes method-specific.
      *  https://tools.ietf.org/html/rfc3261#section-8.2.5
      * @param message - Incoming request message.
      */
    var receiveOutsideDialogRequest: js.Any = js.native
    
    /**
      * UAC and UAS procedures depend strongly on two factors.  First, based
      * on whether the request or response is inside or outside of a dialog,
      * and second, based on the method of a request.  Dialogs are discussed
      * thoroughly in Section 12; they represent a peer-to-peer relationship
      * between user agents and are established by specific SIP methods, such
      * as INVITE.
      * @param message - Incoming request message.
      */
    var receiveRequest: js.Any = js.native
    
    /**
      * In Section 18.2.1, replace the last paragraph with:
      *
      * Next, the server transport attempts to match the request to a
      * server transaction.  It does so using the matching rules described
      * in Section 17.2.3.  If a matching server transaction is found, the
      * request is passed to that transaction for processing.  If no match
      * is found, the request is passed to the core, which may decide to
      * construct a new server transaction for that request.
      * https://tools.ietf.org/html/rfc6026#section-8.10
      * @param message - Incoming request message from transport layer.
      */
    var receiveRequestFromTransport: js.Any = js.native
    
    /**
      * Responses are first processed by the transport layer and then passed
      * up to the transaction layer.  The transaction layer performs its
      * processing and then passes the response up to the TU.  The majority
      * of response processing in the TU is method specific.  However, there
      * are some general behaviors independent of the method.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3
      * @param message - Incoming response message from transport layer.
      */
    var receiveResponseFromTransport: js.Any = js.native
    
    /**
      * Send REGISTER.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def register(request: OutgoingRequestMessage): OutgoingRegisterRequest = js.native
    def register(request: OutgoingRequestMessage, delegate: OutgoingRequestDelegate): OutgoingRegisterRequest = js.native
    
    /**
      * A stateless UAS is a UAS that does not maintain transaction state.
      * It replies to requests normally, but discards any state that would
      * ordinarily be retained by a UAS after a response has been sent.  If a
      * stateless UAS receives a retransmission of a request, it regenerates
      * the response and re-sends it, just as if it were replying to the first
      * instance of the request. A UAS cannot be stateless unless the request
      * processing for that method would always result in the same response
      * if the requests are identical. This rules out stateless registrars,
      * for example.  Stateless UASs do not use a transaction layer; they
      * receive requests directly from the transport layer and send responses
      * directly to the transport layer.
      * https://tools.ietf.org/html/rfc3261#section-8.2.7
      * @param message - Incoming request message to reply to.
      * @param statusCode - Status code to reply with.
      */
    def replyStateless(message: IncomingRequestMessage, options: ResponseOptions): OutgoingResponse = js.native
    
    /**
      * Send a request.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def request(request: OutgoingRequestMessage): OutgoingRequest = js.native
    def request(request: OutgoingRequestMessage, delegate: OutgoingRequestDelegate): OutgoingRequest = js.native
    
    /** Reset. */
    def reset(): Unit = js.native
    
    /**
      * Send SUBSCRIBE.
      * @param request - Outgoing request.
      * @param delegate - Request delegate.
      */
    def subscribe(request: OutgoingRequestMessage): OutgoingSubscribeRequest = js.native
    def subscribe(request: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate): OutgoingSubscribeRequest = js.native
    
    /** Subscribers. */
    var subscribers: Map[String, SubscribeUserAgentClient] = js.native
    
    /** Transport. */
    def transport: Transport = js.native
    
    /** UACs. */
    var userAgentClients: Map[String, UserAgentClient] = js.native
    
    /** UASs. */
    var userAgentServers: Map[String, UserAgentServer] = js.native
  }
}
