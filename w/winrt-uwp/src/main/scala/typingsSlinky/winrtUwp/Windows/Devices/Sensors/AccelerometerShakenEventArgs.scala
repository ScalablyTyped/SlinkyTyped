package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer-shaken event. */
trait AccelerometerShakenEventArgs extends js.Object {
  /** Gets the time at which the sensor reported the shaken event. */
  var timestamp: js.Date
}

object AccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: js.Date): AccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerShakenEventArgs]
  }
}

