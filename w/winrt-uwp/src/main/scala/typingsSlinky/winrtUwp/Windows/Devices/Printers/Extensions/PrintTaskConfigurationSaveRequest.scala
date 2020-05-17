package typingsSlinky.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called when the print dialog for your app raises a SaveRequested event. */
@js.native
trait PrintTaskConfigurationSaveRequest extends js.Object {
  /** Gets the date-time object that provides the deadline information for the print task. */
  var deadline: js.Date = js.native
  /** Called by the device app to cancel the client's request to save the print task configuration. */
  def cancel(): Unit = js.native
  /**
    * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
    * @return The object that represents the deferral for the print task configuration save request.
    */
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  /**
    * Called by the device app to save the print task configuration.
    * @param printerExtensionContext The object that represents the print task extension context.
    */
  def save(printerExtensionContext: js.Any): Unit = js.native
}

object PrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: js.Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): PrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
  }
  @scala.inline
  implicit class PrintTaskConfigurationSaveRequestOps[Self <: PrintTaskConfigurationSaveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

