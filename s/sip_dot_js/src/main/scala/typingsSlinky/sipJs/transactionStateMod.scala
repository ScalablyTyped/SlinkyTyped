package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionStateMod {
  
  @js.native
  sealed trait TransactionState extends StObject
  @JSImport("sip.js/lib/core/transactions/transaction-state", "TransactionState")
  @js.native
  object TransactionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransactionState with String] = js.native
    
    @js.native
    sealed trait Accepted extends TransactionState
    /* "Accepted" */ val Accepted: typingsSlinky.sipJs.transactionStateMod.TransactionState.Accepted with String = js.native
    
    @js.native
    sealed trait Calling extends TransactionState
    /* "Calling" */ val Calling: typingsSlinky.sipJs.transactionStateMod.TransactionState.Calling with String = js.native
    
    @js.native
    sealed trait Completed extends TransactionState
    /* "Completed" */ val Completed: typingsSlinky.sipJs.transactionStateMod.TransactionState.Completed with String = js.native
    
    @js.native
    sealed trait Confirmed extends TransactionState
    /* "Confirmed" */ val Confirmed: typingsSlinky.sipJs.transactionStateMod.TransactionState.Confirmed with String = js.native
    
    @js.native
    sealed trait Proceeding extends TransactionState
    /* "Proceeding" */ val Proceeding: typingsSlinky.sipJs.transactionStateMod.TransactionState.Proceeding with String = js.native
    
    @js.native
    sealed trait Terminated extends TransactionState
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.transactionStateMod.TransactionState.Terminated with String = js.native
    
    @js.native
    sealed trait Trying extends TransactionState
    /* "Trying" */ val Trying: typingsSlinky.sipJs.transactionStateMod.TransactionState.Trying with String = js.native
  }
}
