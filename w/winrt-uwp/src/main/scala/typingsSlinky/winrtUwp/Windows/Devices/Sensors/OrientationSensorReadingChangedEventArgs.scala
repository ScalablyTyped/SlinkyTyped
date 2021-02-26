package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the orientation-sensor reading-changed event. */
@js.native
trait OrientationSensorReadingChangedEventArgs extends StObject {
  
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  var reading: OrientationSensorReading = js.native
}
object OrientationSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: OrientationSensorReading): OrientationSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class OrientationSensorReadingChangedEventArgsMutableBuilder[Self <: OrientationSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: OrientationSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
