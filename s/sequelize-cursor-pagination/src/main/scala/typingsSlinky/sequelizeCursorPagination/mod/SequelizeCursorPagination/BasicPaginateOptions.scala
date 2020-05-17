package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typingsSlinky.sequelize.anon.Exclude
import typingsSlinky.sequelize.mod.FindOptionsAttributesArray
import typingsSlinky.sequelize.mod.IncludeOptions
import typingsSlinky.sequelize.mod.Model
import typingsSlinky.sequelize.mod.WhereOptions
import typingsSlinky.sequelize.mod.and
import typingsSlinky.sequelize.mod.col
import typingsSlinky.sequelize.mod.fn
import typingsSlinky.sequelize.mod.or
import typingsSlinky.sequelize.mod.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicPaginateOptions[T] extends js.Object {
   // the before cursor
  var after: js.UndefOr[String] = js.native
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.native
   // [default: false]
  var before: js.UndefOr[String] = js.native
   // limit the number of records returned
  var desc: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  var limit: js.UndefOr[Double] = js.native
   // the after cursor
  var paginationField: js.UndefOr[String] = js.native
   // [default: primaryKeyField]
  var subQuery: js.UndefOr[Boolean] = js.native
  var where: js.UndefOr[
    WhereOptions[T] | typingsSlinky.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.native
}

object BasicPaginateOptions {
  @scala.inline
  def apply[T](): BasicPaginateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicPaginateOptions[T]]
  }
  @scala.inline
  implicit class BasicPaginateOptionsOps[Self[t] <: BasicPaginateOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAfter(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: FindOptionsAttributesArray | Exclude): Self[T] = {
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
    def withBefore(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withDesc(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
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
    def withPaginationField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationField: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationField")(js.undefined)
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

