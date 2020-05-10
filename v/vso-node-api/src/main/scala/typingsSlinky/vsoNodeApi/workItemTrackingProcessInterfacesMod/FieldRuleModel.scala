package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldRuleModel extends js.Object {
  var actions: js.Array[RuleActionModel] = js.native
  var conditions: js.Array[RuleConditionModel] = js.native
  var friendlyName: String = js.native
  var id: String = js.native
  var isDisabled: Boolean = js.native
  var isSystem: Boolean = js.native
}

object FieldRuleModel {
  @scala.inline
  def apply(
    actions: js.Array[RuleActionModel],
    conditions: js.Array[RuleConditionModel],
    friendlyName: String,
    id: String,
    isDisabled: Boolean,
    isSystem: Boolean
  ): FieldRuleModel = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldRuleModel]
  }
  @scala.inline
  implicit class FieldRuleModelOps[Self <: FieldRuleModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[RuleActionModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[RuleConditionModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

