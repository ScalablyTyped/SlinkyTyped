package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.AnonExclude
import typingsSlinky.sequelize.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that are passed to any model creating a SELECT query
  *
  * A hash of options to describe the scope of the search
  */
@js.native
trait FindOptions[T]
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * A list of the attributes that you want to select. To rename an attribute, you can pass an array, with
    * two elements - the first is the name of the attribute in the DB (or some kind of expression such as
    * `Sequelize.literal`, `Sequelize.fn` and so on), and the second is the name you want the attribute to
    * have in the returned instance
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | AnonExclude] = js.native
  /**
    * Apply DISTINCT(col) for FindAndCount(all)
    */
  var distinct: js.UndefOr[Boolean] = js.native
  /**
    * Group by. It is not mentioned in sequelize's JSDoc, but mentioned in docs.
    * https://github.com/sequelize/sequelize/blob/master/docs/docs/models-usage.md#user-content-manipulating-the-dataset-with-limit-offset-order-and-group
    */
  var group: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  /**
    * having ?!?
    */
  var having: js.UndefOr[AnyWhereOptions] = js.native
  /**
    * A list of associations to eagerly load using a left join. Supported is either
    * `{ include: [ Model1, Model2, ...]}` or `{ include: [{ model: Model1, as: 'Alias' }]}`.
    * If your association are set up with an `as` (eg. `X.hasMany(Y, { as: 'Z }`, you need to specify Z in
    * the as attribute when eager loading Y).
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  /**
    * Limit the results
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Lock the selected rows. Possible options are transaction.LOCK.UPDATE and transaction.LOCK.SHARE.
    * Postgres also supports transaction.LOCK.KEY_SHARE, transaction.LOCK.NO_KEY_UPDATE and specific model
    * locks with joins. See [transaction.LOCK for an example](transaction#lock)
    */
  var lock: js.UndefOr[TransactionLockLevel | AnonLevel] = js.native
  /**
    * Skip the results;
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Specifies an ordering. If a string is provided, it will be escaped. Using an array, you can provide
    * several columns / functions to order by. Each element can be further wrapped in a two-element array. The
    * first element is the column / function to order by, the second is the direction. For example:
    * `order: [['name', 'DESC']]`. In this way the column will be escaped, but the direction will not.
    */
  var order: js.UndefOr[
    String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
  ] = js.native
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  /**
    * Return raw result. See sequelize.query for more information.
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * Throw EmptyResultError if a record is not found
    */
  var rejectOnEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Prevents a subquery on the main table when using include
    */
  var subQuery: js.UndefOr[Boolean] = js.native
  /**
    * Force the query to use the write pool
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.native
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[
    WhereOptions[T] | typingsSlinky.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.native
}

object FindOptions {
  @scala.inline
  def apply[T](): FindOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions[T]]
  }
  @scala.inline
  implicit class FindOptionsOps[Self[t] <: FindOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAttributes(value: FindOptionsAttributesArray | AnonExclude): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinct(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinct: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinct")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String | js.Array[String] | js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHaving(value: AnyWhereOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("having")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHaving: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("having")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(value: TransactionLockLevel | AnonLevel): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(
      value: String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withParanoid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParanoid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paranoid")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectOnEmpty(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectOnEmpty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectOnEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withSubQuery(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubQuery: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMaster(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaster: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaster")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhere: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(js.undefined)
        ret
    }
  }
  
}

