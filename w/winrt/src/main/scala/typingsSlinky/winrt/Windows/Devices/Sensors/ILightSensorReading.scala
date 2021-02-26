package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightSensorReading extends StObject {
  
  var illuminanceInLux: Double = js.native
  
  var timestamp: js.Date = js.native
}
object ILightSensorReading {
  
  @scala.inline
  def apply(illuminanceInLux: Double, timestamp: js.Date): ILightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensorReading]
  }
  
  @scala.inline
  implicit class ILightSensorReadingMutableBuilder[Self <: ILightSensorReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIlluminanceInLux(value: Double): Self = StObject.set(x, "illuminanceInLux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
