package typingsSlinky.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasTaskState extends StObject {
  
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
  implicit class HasTaskStateMutableBuilder[Self <: HasTaskState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: TaskType): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTask(value: Boolean): Self = StObject.set(x, "eventTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacroTask(value: Boolean): Self = StObject.set(x, "macroTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicroTask(value: Boolean): Self = StObject.set(x, "microTask", value.asInstanceOf[js.Any])
  }
}
