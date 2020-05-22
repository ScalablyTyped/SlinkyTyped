package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the reading of an activity sensor that provides readings for the sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorReading")
@js.native
abstract class ActivitySensorReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensorReading {
  /** Gets the activity type for the sensor. */
  /* CompleteClass */
  override var activity: typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivityType = js.native
  /** Gets the reading confidence for the sensor. */
  /* CompleteClass */
  override var confidence: typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingConfidence = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
}

