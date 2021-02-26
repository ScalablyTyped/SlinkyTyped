package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimpleOrientationSensorOrientationChangedEventArgs extends StObject {
  
  var orientation: SimpleOrientation = js.native
  
  var timestamp: js.Date = js.native
}
object ISimpleOrientationSensorOrientationChangedEventArgs {
  
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: js.Date): ISimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensorOrientationChangedEventArgs]
  }
  
  @scala.inline
  implicit class ISimpleOrientationSensorOrientationChangedEventArgsMutableBuilder[Self <: ISimpleOrientationSensorOrientationChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: SimpleOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
