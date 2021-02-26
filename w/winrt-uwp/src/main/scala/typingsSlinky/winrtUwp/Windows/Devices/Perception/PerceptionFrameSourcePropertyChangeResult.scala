package typingsSlinky.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempted property change on a frame source. */
@js.native
trait PerceptionFrameSourcePropertyChangeResult extends StObject {
  
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  var newValue: js.Any = js.native
  
  /** Gets the value of the property after the change request has been processed. */
  var status: PerceptionFrameSourcePropertyChangeStatus = js.native
}
object PerceptionFrameSourcePropertyChangeResult {
  
  @scala.inline
  def apply(newValue: js.Any, status: PerceptionFrameSourcePropertyChangeStatus): PerceptionFrameSourcePropertyChangeResult = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertyChangeResult]
  }
  
  @scala.inline
  implicit class PerceptionFrameSourcePropertyChangeResultMutableBuilder[Self <: PerceptionFrameSourcePropertyChangeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PerceptionFrameSourcePropertyChangeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
