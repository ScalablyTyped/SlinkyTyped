package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the reading of an activity sensor that provides readings for the sensor. */
@js.native
trait ActivitySensorReading extends js.Object {
  /** Gets the activity type for the sensor. */
  var activity: ActivityType = js.native
  /** Gets the reading confidence for the sensor. */
  var confidence: ActivitySensorReadingConfidence = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}

object ActivitySensorReading {
  @scala.inline
  def apply(activity: ActivityType, confidence: ActivitySensorReadingConfidence, timestamp: js.Date): ActivitySensorReading = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySensorReading]
  }
  @scala.inline
  implicit class ActivitySensorReadingOps[Self <: ActivitySensorReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: ActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: ActivitySensorReadingConfidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
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

