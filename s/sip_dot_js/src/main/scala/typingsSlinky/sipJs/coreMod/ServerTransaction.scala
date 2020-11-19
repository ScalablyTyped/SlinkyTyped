package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typingsSlinky.sipJs.transactionsMod.ServerTransaction {
  protected def this(
    _request: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typingsSlinky.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
