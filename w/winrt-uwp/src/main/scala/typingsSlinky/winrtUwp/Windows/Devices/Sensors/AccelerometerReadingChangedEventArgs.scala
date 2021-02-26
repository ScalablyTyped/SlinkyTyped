package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the accelerometer reading–changed event. */
@js.native
trait AccelerometerReadingChangedEventArgs extends StObject {
  
  /** Gets the most recent accelerometer reading. */
  var reading: AccelerometerReading = js.native
}
object AccelerometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: AccelerometerReading): AccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class AccelerometerReadingChangedEventArgsMutableBuilder[Self <: AccelerometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: AccelerometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
