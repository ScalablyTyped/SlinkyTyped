package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation-sensor reading. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
abstract class OrientationSensorReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensorReading {
  /** Gets the Quaternion for the current orientation-sensor reading. */
  /* CompleteClass */
  override var quaternion: typingsSlinky.winrtUwp.Windows.Devices.Sensors.SensorQuaternion = js.native
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  /* CompleteClass */
  override var rotationMatrix: typingsSlinky.winrtUwp.Windows.Devices.Sensors.SensorRotationMatrix = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
  /** Gets the orientation sensor's z-axis accuracy. */
  /* CompleteClass */
  override var yawAccuracy: typingsSlinky.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
}

