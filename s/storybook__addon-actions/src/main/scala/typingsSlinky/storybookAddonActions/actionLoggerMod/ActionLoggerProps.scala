package typingsSlinky.storybookAddonActions.actionLoggerMod

import typingsSlinky.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionLoggerProps extends js.Object {
  var actions: js.Array[ActionDisplay] = js.native
  def onClear(): Unit = js.native
}

object ActionLoggerProps {
  @scala.inline
  def apply(actions: js.Array[ActionDisplay], onClear: () => Unit): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = js.Any.fromFunction0(onClear))
    __obj.asInstanceOf[ActionLoggerProps]
  }
  @scala.inline
  implicit class ActionLoggerPropsOps[Self <: ActionLoggerProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOnClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

