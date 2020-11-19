package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "Transaction")
@js.native
abstract class Transaction protected ()
  extends typingsSlinky.sipJs.transactionsMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsSlinky.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
