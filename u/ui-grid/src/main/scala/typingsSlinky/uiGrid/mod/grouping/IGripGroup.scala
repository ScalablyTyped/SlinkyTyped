package typingsSlinky.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGripGroup extends js.Object {
  var colName: String = js.native
  var field: String = js.native
  var groupPriority: Double = js.native
}

object IGripGroup {
  @scala.inline
  def apply(colName: String, field: String, groupPriority: Double): IGripGroup = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGripGroup]
  }
  @scala.inline
  implicit class IGripGroupOps[Self <: IGripGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPriority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

