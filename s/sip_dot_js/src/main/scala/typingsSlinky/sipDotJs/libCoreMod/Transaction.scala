package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import typingsSlinky.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Transaction")
@js.native
abstract class Transaction protected ()
  extends typingsSlinky.sipDotJs.libCoreTransactionsMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

