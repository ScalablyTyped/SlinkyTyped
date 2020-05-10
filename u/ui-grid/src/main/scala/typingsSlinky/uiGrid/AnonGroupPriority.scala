package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupPriority extends js.Object {
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: Double = js.native
}

object AnonGroupPriority {
  @scala.inline
  def apply(groupPriority: Double): AnonGroupPriority = {
    val __obj = js.Dynamic.literal(groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupPriority]
  }
  @scala.inline
  implicit class AnonGroupPriorityOps[Self <: AnonGroupPriority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPriority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

