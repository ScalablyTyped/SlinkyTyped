package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Transaction
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/transaction.js
//
/**
  * The transaction object is used to identify a running transaction. It is created by calling
  * `Sequelize.transaction()`.
  *
  * To run a query under a transaction, you should pass the transaction in the options object.
  */
@js.native
trait Transaction extends StObject {
  
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock = js.native
  
  /**
    * Commit the transaction
    */
  def commit(): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): typingsSlinky.bluebird.mod.^[Unit] = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: () => typingsSlinky.bluebird.mod.^[Unit],
    rollback: () => typingsSlinky.bluebird.mod.^[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLOCK(value: TransactionLock): Self = StObject.set(x, "LOCK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollback(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
  }
}
