package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reading from the proximity sensor. */
@js.native
trait ProximitySensorReading extends StObject {
  
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double = js.native
  
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean = js.native
  
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: js.Date = js.native
}
object ProximitySensorReading {
  
  @scala.inline
  def apply(distanceInMillimeters: Double, isDetected: Boolean, timestamp: js.Date): ProximitySensorReading = {
    val __obj = js.Dynamic.literal(distanceInMillimeters = distanceInMillimeters.asInstanceOf[js.Any], isDetected = isDetected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReading]
  }
  
  @scala.inline
  implicit class ProximitySensorReadingMutableBuilder[Self <: ProximitySensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceInMillimeters(value: Double): Self = StObject.set(x, "distanceInMillimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDetected(value: Boolean): Self = StObject.set(x, "isDetected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
