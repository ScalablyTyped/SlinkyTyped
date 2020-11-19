package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.Transaction")
@js.native
abstract class Transaction protected ()
  extends typingsSlinky.sipJs.coreMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typingsSlinky.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
