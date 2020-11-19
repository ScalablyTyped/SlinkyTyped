package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A threshold for the Pedometer sensor. When the threshold conditions are met, the sensor trigger will activate. */
@JSGlobal("Windows.Devices.Sensors.PedometerDataThreshold")
@js.native
class PedometerDataThreshold protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.PedometerDataThreshold {
  /**
    * Creates a PedometerDataThreshold object.
    * @param sensor The pedometer sensor.
    * @param stepGoal The number of steps before the threshold is exceeded and the background task is activated.
    */
  def this(sensor: typingsSlinky.winrtUwp.Windows.Devices.Sensors.Pedometer, stepGoal: Double) = this()
}
