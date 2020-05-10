package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleActionModel extends js.Object {
  var actionType: String = js.native
  var targetField: String = js.native
  var value: String = js.native
}

object RuleActionModel {
  @scala.inline
  def apply(actionType: String, targetField: String, value: String): RuleActionModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionModel]
  }
  @scala.inline
  implicit class RuleActionModelOps[Self <: RuleActionModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

