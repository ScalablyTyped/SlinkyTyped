package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictResult")
@js.native
abstract class AppointmentConflictResult ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictResult {
  /** Gets the date of the appointment conflict. */
  /* CompleteClass */
  override var date: js.Date = js.native
  /** Gets a value indicating the type of appointment conflict. */
  /* CompleteClass */
  override var `type`: typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentConflictType = js.native
}

