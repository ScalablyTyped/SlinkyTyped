package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a conflict between appointments. */
trait AppointmentConflictResult extends js.Object {
  /** Gets the date of the appointment conflict. */
  var date: js.Date
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType
}

object AppointmentConflictResult {
  @scala.inline
  def apply(date: js.Date, `type`: AppointmentConflictType): AppointmentConflictResult = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentConflictResult]
  }
}

