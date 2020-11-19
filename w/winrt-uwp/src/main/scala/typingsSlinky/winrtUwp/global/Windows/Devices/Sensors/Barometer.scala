package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
abstract class Barometer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Barometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Barometer")
@js.native
object Barometer extends js.Object {
  
  /**
    * Returns the default barometer sensor.
    * @return The default barometer.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.Barometer = js.native
}
