package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/transaction-state", JSImport.Namespace)
@js.native
object libCoreTransactionsTransactionDashStateMod extends js.Object {
  @js.native
  sealed trait TransactionState extends js.Object
  
  @js.native
  object TransactionState extends js.Object {
    @js.native
    sealed trait Accepted extends TransactionState
    
    @js.native
    sealed trait Calling extends TransactionState
    
    @js.native
    sealed trait Completed extends TransactionState
    
    @js.native
    sealed trait Confirmed extends TransactionState
    
    @js.native
    sealed trait Proceeding extends TransactionState
    
    @js.native
    sealed trait Terminated extends TransactionState
    
    @js.native
    sealed trait Trying extends TransactionState
    
    /* "Accepted" */ val Accepted: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with String = js.native
    /* "Calling" */ val Calling: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with String = js.native
    /* "Completed" */ val Completed: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with String = js.native
    /* "Confirmed" */ val Confirmed: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with String = js.native
    /* "Proceeding" */ val Proceeding: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with String = js.native
    /* "Terminated" */ val Terminated: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with String = js.native
    /* "Trying" */ val Trying: typingsSlinky.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TransactionState with String] = js.native
  }
  
}

