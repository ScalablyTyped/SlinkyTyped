package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typingsSlinky.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typingsSlinky.sipDotJs.libCoreTransactionsMod.ServerTransaction {
  protected def this(
    _request: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

