package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Transaction extends js.Object {
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
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOCK(value: TransactionLock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRollback(value: () => typingsSlinky.bluebird.mod.^[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

