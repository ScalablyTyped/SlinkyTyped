package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.count method
  */
@js.native
trait CountOptions
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * Used in conjustion with `group`
    */
  var attributes: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.native
  /**
    * Apply column on which COUNT() should be applied
    */
  var col: js.UndefOr[String] = js.native
  /**
    * Apply COUNT(DISTINCT(col))
    */
  var distinct: js.UndefOr[Boolean] = js.native
  /**
    * For creating complex counts. Will return multiple rows as needed.
    *
    * TODO: Check?
    */
  var group: js.UndefOr[js.Object] = js.native
  /**
    * Include options. See `find` for details
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions | js.Array[String]] = js.native
}

object CountOptions {
  @scala.inline
  def apply(): CountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountOptions]
  }
  @scala.inline
  implicit class CountOptionsOps[Self <: CountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String | (js.Tuple2[String, String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(js.undefined)
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
    def withGroup(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withWhere(value: AnyWhereOptions | js.Array[String]): Self = {
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

