package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
abstract class Inclinometer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Inclinometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Inclinometer")
@js.native
object Inclinometer extends js.Object {
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Inclinometer = js.native
  
  /**
    * Returns the default inclinometer.
    * @return The default inclinometer or null if no inclinometers are found.
    */
  def getDefaultForRelativeReadings(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Inclinometer = js.native
}
