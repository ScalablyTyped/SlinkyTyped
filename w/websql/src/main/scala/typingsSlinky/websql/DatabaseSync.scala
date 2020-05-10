package typingsSlinky.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.4 Synchronous database API
  */
@js.native
trait DatabaseSync extends js.Object {
  /*readonly/const*/ var version: DOMString = js.native
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit = js.native
  def readTransaction(callback: SQLTransactionSyncCallback): Unit = js.native
  def transaction(callback: SQLTransactionSyncCallback): Unit = js.native
}

object DatabaseSync {
  @scala.inline
  def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit,
    readTransaction: SQLTransactionSyncCallback => Unit,
    transaction: SQLTransactionSyncCallback => Unit,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = js.Any.fromFunction3(changeVersion), readTransaction = js.Any.fromFunction1(readTransaction), transaction = js.Any.fromFunction1(transaction), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSync]
  }
  @scala.inline
  implicit class DatabaseSyncOps[Self <: DatabaseSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeVersion(value: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeVersion")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReadTransaction(value: SQLTransactionSyncCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransaction(value: SQLTransactionSyncCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: DOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

