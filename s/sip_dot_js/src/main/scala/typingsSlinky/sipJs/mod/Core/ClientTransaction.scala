package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ClientTransactionUser
import org.scalablytyped.runtime.StObject
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
object ClientTransaction {
  
  @JSImport("sip.js", "Core.ClientTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Core.ClientTransaction.makeId")
  @js.native
  def makeId: js.Any = js.native
  @scala.inline
  def makeId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
}
