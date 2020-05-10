package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Model.aggregate
  */
@js.native
trait AggregateOptions extends LoggingOptions {
  /**
    * The type of the result. If `field` is a field in this Model, the default will be the type of that field,
    * otherwise defaults to float.
    */
  var dataType: js.UndefOr[DataTypeAbstract | String] = js.native
  /**
    * Applies DISTINCT to the field being aggregated over
    */
  var distinct: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the first returned value of `aggregateFunction` is cast to `dataType` and returned.
    * If additional attributes are specified, along with `group` clauses, set `plain` to `false` to return all values of all returned rows.
    * Defaults to `true`
    */
  var plain: js.UndefOr[Boolean] = js.native
  /**
    * The transaction that the query should be executed under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}

object AggregateOptions {
  @scala.inline
  def apply(): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateOptions]
  }
  @scala.inline
  implicit class AggregateOptionsOps[Self <: AggregateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: DataTypeAbstract | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
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
    def withWhere(value: AnyWhereOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

