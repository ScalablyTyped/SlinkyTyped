package typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.Appointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
@js.native
trait AddAppointmentOperation extends js.Object {
  /** Gets the Appointment info from the activation request. */
  var appointmentInformation: Appointment = js.native
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String = js.native
  /** Dismisses the UI for the operation that adds a new appointment. */
  def dismissUI(): Unit = js.native
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit = js.native
  /**
    * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
    * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
    */
  def reportCompleted(itemId: String): Unit = js.native
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit = js.native
}

object AddAppointmentOperation {
  @scala.inline
  def apply(
    appointmentInformation: Appointment,
    dismissUI: () => Unit,
    reportCanceled: () => Unit,
    reportCompleted: String => Unit,
    reportError: String => Unit,
    sourcePackageFamilyName: String
  ): AddAppointmentOperation = {
    val __obj = js.Dynamic.literal(appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAppointmentOperation]
  }
  @scala.inline
  implicit class AddAppointmentOperationOps[Self <: AddAppointmentOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

