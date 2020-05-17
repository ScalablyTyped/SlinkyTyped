package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.Appointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
@js.native
trait ReplaceAppointmentOperation extends js.Object {
  /** Gets the unique identifier of the appointment to replace. */
  var appointmentId: String = js.native
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: Appointment = js.native
  /** Gets the start date and time of the appointment instance to replace. */
  var instanceStartDate: js.Date = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String = js.native
  /** Dismisses the UI for the operation that replaces an appointment. */
  def dismissUI(): Unit = js.native
  /** Informs the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit = js.native
  /**
    * Informs the activating app that the operation was completed successfully.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
    */
  def reportCompleted(itemId: String): Unit = js.native
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit = js.native
}

object ReplaceAppointmentOperation {
  @scala.inline
  def apply(
    appointmentId: String,
    appointmentInformation: Appointment,
    dismissUI: () => Unit,
    instanceStartDate: js.Date,
    reportCanceled: () => Unit,
    reportCompleted: String => Unit,
    reportError: String => Unit,
    sourcePackageFamilyName: String
  ): ReplaceAppointmentOperation = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAppointmentOperation]
  }
  @scala.inline
  implicit class ReplaceAppointmentOperationOps[Self <: ReplaceAppointmentOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentInformation(value: Appointment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissUI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstanceStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportCanceled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCanceled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReportCompleted(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourcePackageFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePackageFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

