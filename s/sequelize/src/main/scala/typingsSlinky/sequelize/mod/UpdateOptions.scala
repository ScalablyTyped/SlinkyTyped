package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Model.update
  */
@js.native
trait UpdateOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions {
  /**
    * Run before / after bulk update hooks?
    *
    * Defaults to true
    */
  var hooks: js.UndefOr[Boolean] = js.native
  /**
    * Run before / after update hooks?. If true, this will execute a SELECT followed by individual UPDATEs.
    * A select is needed, because the row data needs to be passed to the hooks
    *
    * Defaults to false
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  /**
    * How many rows to update (only for mysql and mariadb)
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Whether or not to update the side effects of any virtual setters.
    *
    * Defaults to true
    */
  var sideEffects: js.UndefOr[Boolean] = js.native
  /**
    * If true, the updatedAt timestamp will not be updated.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  /**
    * Options to describe the scope of the search.
    */
  var where: AnyWhereOptions = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(where: AnyWhereOptions): UpdateOptions = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhere(value: AnyWhereOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIndividualHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividualHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
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
  }
  
}

