package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
abstract class Accelerometer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Accelerometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
object Accelerometer extends js.Object {
  
  /**
    * Returns the default accelerometer.
    * @return The default accelerometer or null if no integrated accelerometers are found.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Accelerometer = js.native
}
