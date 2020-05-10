package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Isolations levels can be set per-transaction by passing `options.isolationLevel` to `sequelize.transaction`.
  * Default to `REPEATABLE_READ` but you can override the default isolation level by passing
  * `options.isolationLevel` in `new Sequelize`.
  */
@js.native
trait TransactionIsolationLevels extends js.Object {
   // 'READ UNCOMMITTED'
  var READ_COMMITTED: TransactionIsolationLevelReadCommitted = js.native
  var READ_UNCOMMITTED: TransactionIsolationLevelReadUncommitted = js.native
   // 'READ COMMITTED'
  var REPEATABLE_READ: TransactionIsolationLevelRepeatableRead = js.native
   // 'REPEATABLE READ'
  var SERIALIZABLE: TransactionIsolationLevelSerializable = js.native
}

object TransactionIsolationLevels {
  @scala.inline
  def apply(
    READ_COMMITTED: TransactionIsolationLevelReadCommitted,
    READ_UNCOMMITTED: TransactionIsolationLevelReadUncommitted,
    REPEATABLE_READ: TransactionIsolationLevelRepeatableRead,
    SERIALIZABLE: TransactionIsolationLevelSerializable
  ): TransactionIsolationLevels = {
    val __obj = js.Dynamic.literal(READ_COMMITTED = READ_COMMITTED.asInstanceOf[js.Any], READ_UNCOMMITTED = READ_UNCOMMITTED.asInstanceOf[js.Any], REPEATABLE_READ = REPEATABLE_READ.asInstanceOf[js.Any], SERIALIZABLE = SERIALIZABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionIsolationLevels]
  }
  @scala.inline
  implicit class TransactionIsolationLevelsOps[Self <: TransactionIsolationLevels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREAD_COMMITTED(value: TransactionIsolationLevelReadCommitted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READ_COMMITTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREAD_UNCOMMITTED(value: TransactionIsolationLevelReadUncommitted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READ_UNCOMMITTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREPEATABLE_READ(value: TransactionIsolationLevelRepeatableRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REPEATABLE_READ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERIALIZABLE(value: TransactionIsolationLevelSerializable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERIALIZABLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

