package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typingsSlinky.sipJs.coreMod.ServerTransaction {
  protected def this(
    _request: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typingsSlinky.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

