package typingsSlinky.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccelerometerReadingChangedEventArgs extends StObject {
  
  var reading: AccelerometerReading = js.native
}
object IAccelerometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: AccelerometerReading): IAccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IAccelerometerReadingChangedEventArgsMutableBuilder[Self <: IAccelerometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: AccelerometerReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
