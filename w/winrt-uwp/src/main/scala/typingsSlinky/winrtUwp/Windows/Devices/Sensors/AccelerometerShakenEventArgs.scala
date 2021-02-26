package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the accelerometer-shaken event. */
@js.native
trait AccelerometerShakenEventArgs extends StObject {
  
  /** Gets the time at which the sensor reported the shaken event. */
  var timestamp: js.Date = js.native
}
object AccelerometerShakenEventArgs {
  
  @scala.inline
  def apply(timestamp: js.Date): AccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerShakenEventArgs]
  }
  
  @scala.inline
  implicit class AccelerometerShakenEventArgsMutableBuilder[Self <: AccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
