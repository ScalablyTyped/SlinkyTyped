package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Through options for Include Options
  */
@js.native
trait IncludeThroughOptions extends js.Object {
  /**
    * A list of attributes to select from the join model for belongsToMany relations
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter on the join model for belongsToMany relations
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}

object IncludeThroughOptions {
  @scala.inline
  def apply(): IncludeThroughOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeThroughOptions]
  }
  @scala.inline
  implicit class IncludeThroughOptionsOps[Self <: IncludeThroughOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
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

