package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.ClientTransaction {
  protected def this(
    _request: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    transport: typingsSlinky.sipDotJs.libCoreTransportMod.Transport,
    user: ClientTransactionUser,
    state: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

/* static members */
@JSImport("sip.js", "Core.ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  var makeId: js.Any = js.native
}

