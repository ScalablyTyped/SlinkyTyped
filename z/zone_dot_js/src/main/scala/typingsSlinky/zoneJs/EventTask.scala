package typingsSlinky.zoneJs

import typingsSlinky.zoneJs.zoneJsStrings.eventTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTask extends Task {
  
  @JSName("type")
  var type_EventTask: eventTask = js.native
}
object EventTask {
  
  @scala.inline
  def apply(
    callback: js.Function,
    cancelScheduleRequest: () => Unit,
    invoke: js.Function,
    runCount: Double,
    source: String,
    state: TaskState,
    `type`: eventTask,
    zone: Zone
  ): EventTask = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], cancelScheduleRequest = js.Any.fromFunction0(cancelScheduleRequest), invoke = invoke.asInstanceOf[js.Any], runCount = runCount.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTask]
  }
  
  @scala.inline
  implicit class EventTaskMutableBuilder[Self <: EventTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: eventTask): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
