package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleOrientationSensorOrientationChangedEventArgs extends ISimpleOrientationSensorOrientationChangedEventArgs
object SimpleOrientationSensorOrientationChangedEventArgs {
  
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: js.Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
}
