package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.NonInviteServerTransaction")
@js.native
class NonInviteServerTransaction protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.NonInviteServerTransaction {
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
    request: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
    user: ServerTransactionUser
  ) = this()
}

