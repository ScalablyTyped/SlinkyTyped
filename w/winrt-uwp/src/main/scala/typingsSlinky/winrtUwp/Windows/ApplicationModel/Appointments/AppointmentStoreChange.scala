package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change that has occurred in an appointment store. */
@js.native
trait AppointmentStoreChange extends js.Object {
  /** Gets the Appointment associated with the change. */
  var appointment: Appointment = js.native
  /** Gets the AppointmentCalendar in which the change occurred. */
  var appointmentCalendar: AppointmentCalendar = js.native
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  var changeType: AppointmentStoreChangeType = js.native
}

object AppointmentStoreChange {
  @scala.inline
  def apply(
    appointment: Appointment,
    appointmentCalendar: AppointmentCalendar,
    changeType: AppointmentStoreChangeType
  ): AppointmentStoreChange = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], appointmentCalendar = appointmentCalendar.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChange]
  }
  @scala.inline
  implicit class AppointmentStoreChangeOps[Self <: AppointmentStoreChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointment(value: Appointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentCalendar(value: AppointmentCalendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeType(value: AppointmentStoreChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

