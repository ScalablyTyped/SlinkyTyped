package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options provided when the transaction is created
  *
  * @see sequelize.transaction()
  */
@js.native
trait TransactionOptions extends js.Object {
  var autocommit: js.UndefOr[Boolean] = js.native
  /**
    * Sets the constraints to be deferred or immediately checked.
    */
  var deferrable: js.UndefOr[
    DeferrableSetImmediate | DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred
  ] = js.native
  /**
    *  See `Sequelize.Transaction.ISOLATION_LEVELS` for possible options
    */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.native
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[js.Function] = js.native
  /**
    * Specify the parent transaction so that this transaction is nested or a save point within the parent
    */
  var transaction: js.UndefOr[Transaction] = js.native
  /**
    *  See `Sequelize.Transaction.TYPES` for possible options
    */
  var `type`: js.UndefOr[TransactionType] = js.native
}

object TransactionOptions {
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocommit")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferrable(
      value: DeferrableSetImmediate | DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferrable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferrable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferrable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolationLevel(value: TransactionIsolationLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: Transaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

