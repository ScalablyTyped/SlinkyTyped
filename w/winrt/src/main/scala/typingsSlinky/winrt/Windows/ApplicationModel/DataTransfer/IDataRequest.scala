package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataRequest extends StObject {
  
  var data: DataPackage = js.native
  
  var deadline: js.Date = js.native
  
  def failWithDisplayText(value: String): Unit = js.native
  
  def getDeferral(): DataRequestDeferral = js.native
}
object IDataRequest {
  
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IDataRequest]
  }
  
  @scala.inline
  implicit class IDataRequestMutableBuilder[Self <: IDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataPackage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailWithDisplayText(value: String => Unit): Self = StObject.set(x, "failWithDisplayText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeferral(value: () => DataRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
