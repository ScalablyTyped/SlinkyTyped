package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
@js.native
trait ProximitySensorReading extends js.Object {
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double = js.native
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean = js.native
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: js.Date = js.native
}

object ProximitySensorReading {
  @scala.inline
  def apply(distanceInMillimeters: Double, isDetected: Boolean, timestamp: js.Date): ProximitySensorReading = {
    val __obj = js.Dynamic.literal(distanceInMillimeters = distanceInMillimeters.asInstanceOf[js.Any], isDetected = isDetected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReading]
  }
  @scala.inline
  implicit class ProximitySensorReadingOps[Self <: ProximitySensorReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceInMillimeters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceInMillimeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDetected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

