package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction type can be set per-transaction by passing `options.type` to `sequelize.transaction`.
  * Default to `DEFERRED` but you can override the default isolation level by passing
  * `options.transactionType` in `new Sequelize`.
  */
@js.native
trait TransactionTypes extends js.Object {
  var DEFERRED: TransactionTypeDeferred = js.native
   // 'IMMEDIATE'
  var EXCLUSIVE: TransactionTypeExclusive = js.native
   // 'DEFERRED'
  var IMMEDIATE: TransactionTypeImmediate = js.native
}

object TransactionTypes {
  @scala.inline
  def apply(
    DEFERRED: TransactionTypeDeferred,
    EXCLUSIVE: TransactionTypeExclusive,
    IMMEDIATE: TransactionTypeImmediate
  ): TransactionTypes = {
    val __obj = js.Dynamic.literal(DEFERRED = DEFERRED.asInstanceOf[js.Any], EXCLUSIVE = EXCLUSIVE.asInstanceOf[js.Any], IMMEDIATE = IMMEDIATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTypes]
  }
  @scala.inline
  implicit class TransactionTypesOps[Self <: TransactionTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFERRED(value: TransactionTypeDeferred): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFERRED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXCLUSIVE(value: TransactionTypeExclusive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXCLUSIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMMEDIATE(value: TransactionTypeImmediate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMMEDIATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

