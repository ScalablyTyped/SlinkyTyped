package typingsSlinky.storybookComponents.actionBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarProps extends js.Object {
  var actionItems: js.Array[ActionItem] = js.native
}

object ActionBarProps {
  @scala.inline
  def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
    val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBarProps]
  }
  @scala.inline
  implicit class ActionBarPropsOps[Self <: ActionBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionItems(value: js.Array[ActionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

