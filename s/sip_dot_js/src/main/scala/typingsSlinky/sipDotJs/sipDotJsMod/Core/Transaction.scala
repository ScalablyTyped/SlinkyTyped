package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import typingsSlinky.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Transaction")
@js.native
abstract class Transaction protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

