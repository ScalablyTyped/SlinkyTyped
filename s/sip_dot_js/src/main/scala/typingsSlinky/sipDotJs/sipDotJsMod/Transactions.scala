package typingsSlinky.sipDotJs.sipDotJsMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transactions")
@js.native
object Transactions extends js.Object {
  @js.native
  class InviteClientTransaction protected ()
    extends typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request - The outgoing INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: OutgoingRequestMessage,
      transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request - Incoming INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: IncomingRequestMessage,
      transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends typingsSlinky.sipDotJs.libCoreTransactionsMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request - The outgoing Non-INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: OutgoingRequestMessage,
      transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends typingsSlinky.sipDotJs.libCoreTransactionsMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request - Incoming Non-INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: IncomingRequestMessage,
      transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  var InviteClientTransaction: Instantiable3[
    /* request */ OutgoingRequestMessage, 
    /* transport */ typingsSlinky.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ClientTransactionUser, 
    typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteClientTransaction
  ] = js.native
  var InviteServerTransaction: Instantiable3[
    /* request */ IncomingRequestMessage, 
    /* transport */ typingsSlinky.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ServerTransactionUser, 
    typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteServerTransaction
  ] = js.native
  var NonInviteClientTransaction: Instantiable3[
    /* request */ OutgoingRequestMessage, 
    /* transport */ typingsSlinky.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ClientTransactionUser, 
    typingsSlinky.sipDotJs.libCoreTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var NonInviteServerTransaction: Instantiable3[
    /* request */ IncomingRequestMessage, 
    /* transport */ typingsSlinky.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ServerTransactionUser, 
    typingsSlinky.sipDotJs.libCoreTransactionsMod.NonInviteServerTransaction
  ] = js.native
}

