package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.IMErrorType
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched in case of instant messaging subsystem error
  */
@js.native
trait SystemError extends VoxImplantIMEvent {
  
  /**
    *    Error data object, contains the error details
    */
  var errorData: js.Object = js.native
  
  /**
    *    Error type
    */
  var errorType: IMErrorType = js.native
}
object SystemError {
  
  @scala.inline
  def apply(errorData: js.Object, errorType: IMErrorType): SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemError]
  }
  
  @scala.inline
  implicit class SystemErrorMutableBuilder[Self <: SystemError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorData(value: js.Object): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: IMErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
  }
}
