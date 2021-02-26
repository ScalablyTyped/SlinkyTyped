package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the compass reading–changed event. */
@js.native
trait CompassReadingChangedEventArgs extends StObject {
  
  /** Gets the current compass reading. */
  var reading: CompassReading = js.native
}
object CompassReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: CompassReading): CompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class CompassReadingChangedEventArgsMutableBuilder[Self <: CompassReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReading(value: CompassReading): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
  }
}
