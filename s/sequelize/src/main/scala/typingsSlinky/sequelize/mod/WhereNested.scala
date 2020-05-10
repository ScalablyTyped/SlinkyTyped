package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where Complex nested query
  */
@js.native
trait WhereNested extends js.Object {
  @JSName("$and")
  var $and: js.Array[AnyWhereOptions | WhereLogic] = js.native
  @JSName("$or")
  var $or: js.Array[AnyWhereOptions | WhereLogic] = js.native
}

object WhereNested {
  @scala.inline
  def apply($and: js.Array[AnyWhereOptions | WhereLogic], $or: js.Array[AnyWhereOptions | WhereLogic]): WhereNested = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereNested]
  }
  @scala.inline
  implicit class WhereNestedOps[Self <: WhereNested] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$and(value: js.Array[AnyWhereOptions | WhereLogic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$or(value: js.Array[AnyWhereOptions | WhereLogic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

