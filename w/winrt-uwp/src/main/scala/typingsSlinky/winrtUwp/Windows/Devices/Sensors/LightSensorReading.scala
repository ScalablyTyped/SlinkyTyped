package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient light–sensor reading. */
@js.native
trait LightSensorReading extends StObject {
  
  /** Gets the illuminance level in lux. */
  var illuminanceInLux: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}
object LightSensorReading {
  
  @scala.inline
  def apply(illuminanceInLux: Double, timestamp: js.Date): LightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReading]
  }
  
  @scala.inline
  implicit class LightSensorReadingMutableBuilder[Self <: LightSensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIlluminanceInLux(value: Double): Self = StObject.set(x, "illuminanceInLux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
