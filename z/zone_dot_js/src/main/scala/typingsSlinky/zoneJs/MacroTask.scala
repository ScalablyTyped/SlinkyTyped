package typingsSlinky.zoneJs

import typingsSlinky.zoneJs.zoneJsStrings.macroTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroTask extends Task {
  @JSName("type")
  var type_MacroTask: macroTask = js.native
}

object MacroTask {
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: macroTask,
    zone: Zone
  ): MacroTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroTask]
  }
  @scala.inline
  implicit class MacroTaskOps[Self <: MacroTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: macroTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

