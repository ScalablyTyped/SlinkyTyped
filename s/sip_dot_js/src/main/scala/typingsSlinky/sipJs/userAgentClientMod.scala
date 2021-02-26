package typingsSlinky.sipJs

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.sipJs.coreExceptionsMod.TransportError
import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.logMod.Logger
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.messagesMod.IncomingResponseMessage
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.transactionUserMod.ClientTransactionUser
import typingsSlinky.sipJs.transactionsMod.ClientTransaction
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/user-agent-client", "UserAgentClient")
  @js.native
  class UserAgentClient protected () extends OutgoingRequest {
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
    
    var _transaction: js.Any = js.native
    
    /**
      * If a 401 (Unauthorized) or 407 (Proxy Authentication Required)
      * response is received, the UAC SHOULD follow the authorization
      * procedures of Section 22.2 and Section 22.3 to retry the request with
      * credentials.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3.5
      * 22 Usage of HTTP Authentication
      * https://tools.ietf.org/html/rfc3261#section-22
      * 22.1 Framework
      * https://tools.ietf.org/html/rfc3261#section-22.1
      * 22.2 User-to-User Authentication
      * https://tools.ietf.org/html/rfc3261#section-22.2
      * 22.3 Proxy-to-User Authentication
      * https://tools.ietf.org/html/rfc3261#section-22.3
      *
      * FIXME: This "guard for and retry the request with credentials"
      * implementation is not complete and at best minimally passable.
      * @param response - The incoming response to guard.
      * @param dialog - If defined, the dialog within which the response was received.
      * @returns True if the program execution is to continue in the branch in question.
      *          Otherwise the request is retried with credentials and current request processing must stop.
      */
    /* protected */ def authenticationGuard(message: IncomingResponseMessage): Boolean = js.native
    /* protected */ def authenticationGuard(message: IncomingResponseMessage, dialog: Dialog): Boolean = js.native
    
    var challenged: js.Any = js.native
    
    var core: UserAgentCore = js.native
    
    var credentials: js.Any = js.native
    
    var init: js.Any = js.native
    
    var logger: Logger = js.native
    
    def loggerFactory: LoggerFactory = js.native
    
    @JSName("message")
    var message_UserAgentClient: OutgoingRequestMessage = js.native
    
    /**
      * 8.1.3.1 Transaction Layer Errors
      * In some cases, the response returned by the transaction layer will
      * not be a SIP message, but rather a transaction layer error.  When a
      * timeout error is received from the transaction layer, it MUST be
      * treated as if a 408 (Request Timeout) status code has been received.
      * If a fatal transport error is reported by the transport layer
      * (generally, due to fatal ICMP errors in UDP or connection failures in
      * TCP), the condition MUST be treated as a 503 (Service Unavailable)
      * status code.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
      */
    /* protected */ def onRequestTimeout(): Unit = js.native
    
    /**
      * 8.1.3.1 Transaction Layer Errors
      * In some cases, the response returned by the transaction layer will
      * not be a SIP message, but rather a transaction layer error.  When a
      * timeout error is received from the transaction layer, it MUST be
      * treated as if a 408 (Request Timeout) status code has been received.
      * If a fatal transport error is reported by the transport layer
      * (generally, due to fatal ICMP errors in UDP or connection failures in
      * TCP), the condition MUST be treated as a 503 (Service Unavailable)
      * status code.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
      * @param error - Transport error
      */
    /* protected */ def onTransportError(error: TransportError): Unit = js.native
    
    /**
      * Receive a response from the transaction layer.
      * @param message - Incoming response message.
      */
    /* protected */ def receiveResponse(message: IncomingResponseMessage): Unit = js.native
    
    var stale: js.Any = js.native
    
    /** The transaction associated with this request. */
    def transaction: ClientTransaction = js.native
    
    var transactionConstructor: js.Any = js.native
  }
  
  type ClientTransactionConstructor = Instantiable3[
    /* message */ OutgoingRequestMessage, 
    /* transport */ Transport, 
    /* user */ ClientTransactionUser, 
    ClientTransaction
  ]
}
