package typingsSlinky.storybookAddonActions.containersActionLoggerMod

import typingsSlinky.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionLoggerState extends js.Object {
  var actions: js.Array[ActionDisplay] = js.native
}

object ActionLoggerState {
  @scala.inline
  def apply(actions: js.Array[ActionDisplay]): ActionLoggerState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionLoggerState]
  }
  @scala.inline
  implicit class ActionLoggerStateOps[Self <: ActionLoggerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ActionDisplay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

