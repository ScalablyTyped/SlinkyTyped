package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ClientTransactionUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ClientTransaction")
@js.native
abstract class ClientTransaction protected ()
  extends typingsSlinky.sipJs.transactionsMod.ClientTransaction {
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
  
  @JSImport("sip.js/lib/core", "ClientTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/core", "ClientTransaction.makeId")
  @js.native
  def makeId: js.Any = js.native
  @scala.inline
  def makeId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeId")(x.asInstanceOf[js.Any])
}
