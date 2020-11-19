package typingsSlinky.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.TransactionState")
@js.native
object TransactionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.transactionStateMod.TransactionState with String] = js.native
  
  /* "Accepted" */ val Accepted: typingsSlinky.sipJs.transactionStateMod.TransactionState.Accepted with String = js.native
  
  /* "Calling" */ val Calling: typingsSlinky.sipJs.transactionStateMod.TransactionState.Calling with String = js.native
  
  /* "Completed" */ val Completed: typingsSlinky.sipJs.transactionStateMod.TransactionState.Completed with String = js.native
  
  /* "Confirmed" */ val Confirmed: typingsSlinky.sipJs.transactionStateMod.TransactionState.Confirmed with String = js.native
  
  /* "Proceeding" */ val Proceeding: typingsSlinky.sipJs.transactionStateMod.TransactionState.Proceeding with String = js.native
  
  /* "Terminated" */ val Terminated: typingsSlinky.sipJs.transactionStateMod.TransactionState.Terminated with String = js.native
  
  /* "Trying" */ val Trying: typingsSlinky.sipJs.transactionStateMod.TransactionState.Trying with String = js.native
}
