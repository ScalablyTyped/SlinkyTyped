package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a compass sensor. */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
abstract class Compass ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Compass
/* static members */
@JSGlobal("Windows.Devices.Sensors.Compass")
@js.native
object Compass extends js.Object {
  
  /**
    * Returns the default compass.
    * @return The default compass or null if no integrated compasses are found.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Compass = js.native
}
