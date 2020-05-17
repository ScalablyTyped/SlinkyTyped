package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a system condition that must be in effect for a background task to run. */
@js.native
trait SystemCondition extends js.Object {
  /** Gets the condition type of a system condition. */
  var conditionType: SystemConditionType = js.native
}

object SystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): SystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemCondition]
  }
  @scala.inline
  implicit class SystemConditionOps[Self <: SystemCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionType(value: SystemConditionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

