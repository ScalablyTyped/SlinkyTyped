package typingsSlinky.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount[TInstance] extends js.Object {
  var count: Double = js.native
  var rows: js.Array[TInstance] = js.native
}

object AnonCount {
  @scala.inline
  def apply[TInstance](count: Double, rows: js.Array[TInstance]): AnonCount[TInstance] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount[TInstance]]
  }
  @scala.inline
  implicit class AnonCountOps[Self[tinstance] <: AnonCount[tinstance], TInstance] (val x: Self[TInstance]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TInstance] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TInstance]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TInstance] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TInstance] with Other]
    @scala.inline
    def withCount(value: Double): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[TInstance]): Self[TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

