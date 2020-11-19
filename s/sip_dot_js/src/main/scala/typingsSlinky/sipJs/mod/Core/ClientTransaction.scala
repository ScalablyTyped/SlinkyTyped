package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ClientTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typingsSlinky.sipJs.coreMod.ClientTransaction {
  protected def this(
    _request: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    transport: Transport,
    user: ClientTransactionUser,
    state: typingsSlinky.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
/* static members */
@JSImport("sip.js", "Core.ClientTransaction")
@js.native
object ClientTransaction extends js.Object {
  
  var makeId: js.Any = js.native
}
