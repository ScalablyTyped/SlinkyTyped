package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
abstract class Gyrometer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Gyrometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Gyrometer")
@js.native
object Gyrometer extends js.Object {
  
  /**
    * Returns the default gyrometer.
    * @return The default gyrometer or null if no integrated gyrometers are found.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Gyrometer = js.native
}
