package typingsSlinky.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasTaskState extends js.Object {
  var change: TaskType = js.native
  var eventTask: Boolean = js.native
  var macroTask: Boolean = js.native
  var microTask: Boolean = js.native
}

object HasTaskState {
  @scala.inline
  def apply(change: TaskType, eventTask: Boolean, macroTask: Boolean, microTask: Boolean): HasTaskState = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], eventTask = eventTask.asInstanceOf[js.Any], macroTask = macroTask.asInstanceOf[js.Any], microTask = microTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasTaskState]
  }
  @scala.inline
  implicit class HasTaskStateOps[Self <: HasTaskState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: TaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacroTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macroTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicroTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microTask")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

