package typingsSlinky.sipJs

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.logMod.Logger
import typingsSlinky.sipJs.logMod.LoggerFactory
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.transactionUserMod.ServerTransactionUser
import typingsSlinky.sipJs.transactionsMod.ServerTransaction
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/user-agent-server", "UserAgentServer")
  @js.native
  class UserAgentServer protected () extends IncomingRequest {
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
    
    var _transaction: js.Any = js.native
    
    /* protected */ def acceptable: Boolean = js.native
    
    var core: UserAgentCore = js.native
    
    def dispose(): Unit = js.native
    
    var init: js.Any = js.native
    
    var logger: Logger = js.native
    
    def loggerFactory: LoggerFactory = js.native
    
    @JSName("message")
    var message_UserAgentServer: IncomingRequestMessage = js.native
    
    /* protected */ def progressable: Boolean = js.native
    
    /**
      * If the UAS did not find a matching transaction for the CANCEL
      * according to the procedure above, it SHOULD respond to the CANCEL
      * with a 481 (Call Leg/Transaction Does Not Exist).  If the transaction
      * for the original request still exists, the behavior of the UAS on
      * receiving a CANCEL request depends on whether it has already sent a
      * final response for the original request.  If it has, the CANCEL
      * request has no effect on the processing of the original request, no
      * effect on any session state, and no effect on the responses generated
      * for the original request.  If the UAS has not issued a final response
      * for the original request, its behavior depends on the method of the
      * original request.  If the original request was an INVITE, the UAS
      * SHOULD immediately respond to the INVITE with a 487 (Request
      * Terminated).  A CANCEL request has no impact on the processing of
      * transactions with any other method defined in this specification.
      * https://tools.ietf.org/html/rfc3261#section-9.2
      * @param request - Incoming CANCEL request.
      */
    def receiveCancel(message: IncomingRequestMessage): Unit = js.native
    
    /* protected */ def redirectable: Boolean = js.native
    
    /* protected */ def rejectable: Boolean = js.native
    
    /**
      * When a UAS wishes to construct a response to a request, it follows
      * the general procedures detailed in the following subsections.
      * Additional behaviors specific to the response code in question, which
      * are not detailed in this section, may also be required.
      *
      * Once all procedures associated with the creation of a response have
      * been completed, the UAS hands the response back to the server
      * transaction from which it received the request.
      * https://tools.ietf.org/html/rfc3261#section-8.2.6
      * @param statusCode - Status code to reply with.
      * @param options - Reply options bucket.
      */
    var reply: js.Any = js.native
    
    var toTag: String = js.native
    
    /** The transaction associated with this request. */
    def transaction: ServerTransaction = js.native
    
    var transactionConstructor: js.Any = js.native
    
    /* protected */ def tryingable: Boolean = js.native
  }
  
  type ServerTransactionConstructor = Instantiable3[
    /* message */ IncomingRequestMessage, 
    /* transport */ Transport, 
    /* user */ ServerTransactionUser, 
    ServerTransaction
  ]
}
