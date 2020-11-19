package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D print job request. */
@js.native
trait Print3DTaskRequest extends js.Object {
  
  /**
    * Creates a 3D print job.
    * @param title The name of the print job.
    * @param printerId The identifier of the 3D printer.
    * @param handler The callback for the source of the print job request.
    * @return The 3D print job.
    */
  def createTask(title: String, printerId: String, handler: Print3DTaskSourceRequestedHandler): Print3DTask = js.native
}
object Print3DTaskRequest {
  
  @scala.inline
  def apply(createTask: (String, String, Print3DTaskSourceRequestedHandler) => Print3DTask): Print3DTaskRequest = {
    val __obj = js.Dynamic.literal(createTask = js.Any.fromFunction3(createTask))
    __obj.asInstanceOf[Print3DTaskRequest]
  }
  
  @scala.inline
  implicit class Print3DTaskRequestOps[Self <: Print3DTaskRequest] (val x: Self) extends AnyVal {
    
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
    def setCreateTask(value: (String, String, Print3DTaskSourceRequestedHandler) => Print3DTask): Self = this.set("createTask", js.Any.fromFunction3(value))
  }
}
