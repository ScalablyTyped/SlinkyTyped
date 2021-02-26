package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightSensorReadingChangedEventArgs extends StObject {
  
  var reading: LightSensorReading = js.native
}
object ILightSensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: LightSensorReading): ILightSensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class ILightSensorReadingChangedEventArgsMutableBuilder[Self <: ILightSensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: LightSensorReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
