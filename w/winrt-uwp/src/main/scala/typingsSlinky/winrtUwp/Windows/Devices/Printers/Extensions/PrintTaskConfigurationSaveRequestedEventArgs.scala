package typingsSlinky.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called to notify the device app that the print task configuration must be saved. */
@js.native
trait PrintTaskConfigurationSaveRequestedEventArgs extends js.Object {
  
  /** Gets the information that is required for updating the print task configuration. */
  var request: PrintTaskConfigurationSaveRequest = js.native
}
object PrintTaskConfigurationSaveRequestedEventArgs {
  
  @scala.inline
  def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PrintTaskConfigurationSaveRequestedEventArgsOps[Self <: PrintTaskConfigurationSaveRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: PrintTaskConfigurationSaveRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
