package typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets your app supply the content the user wants to share or specify a message, if an error occurs. */
@js.native
trait DataRequest extends js.Object {
  
  /** Sets or gets a DataPackage object that contains the content a user wants to share. */
  var data: DataPackage = js.native
  
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: js.Date = js.native
  
  /**
    * Cancels the sharing operation and supplies an error string to display to the user.
    * @param value The text to display to the user.
    */
  def failWithDisplayText(value: String): Unit = js.native
  
  /**
    * Supports asynchronous sharing operations by creating and returning a DataRequestDeferral object.
    * @return An object that allows you to share or send content asynchronously.
    */
  def getDeferral(): DataRequestDeferral = js.native
}
object DataRequest {
  
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): DataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[DataRequest]
  }
  
  @scala.inline
  implicit class DataRequestOps[Self <: DataRequest] (val x: Self) extends AnyVal {
    
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
    def setData(value: DataPackage): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline(value: js.Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailWithDisplayText(value: String => Unit): Self = this.set("failWithDisplayText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeferral(value: () => DataRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
