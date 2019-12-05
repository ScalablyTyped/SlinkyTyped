package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typingsSlinky.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typingsSlinky.sipDotJs.libCoreTransactionsMod.ClientTransaction {
  protected def this(
    _request: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

