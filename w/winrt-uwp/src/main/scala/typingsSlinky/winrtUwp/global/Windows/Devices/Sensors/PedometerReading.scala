package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a pedometer reading. */
@JSGlobal("Windows.Devices.Sensors.PedometerReading")
@js.native
abstract class PedometerReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.PedometerReading {
  /** Gets the total number of steps taken for this pedometer reading. */
  /* CompleteClass */
  override var cumulativeSteps: Double = js.native
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  /* CompleteClass */
  override var cumulativeStepsDuration: Double = js.native
  /** Indicates the type of steps taken for this pedometer reading. */
  /* CompleteClass */
  override var stepKind: typingsSlinky.winrtUwp.Windows.Devices.Sensors.PedometerStepKind = js.native
  /** Gets the time for the most recent pedometer reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
}

