package typingsSlinky.winrtUwp.Windows.Management.Deployment

import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the result of a deployment request. */
@js.native
trait DeploymentResult extends StObject {
  
  /** Gets the activity identifier used to look up an event in Windows Event Viewer. Gets the activity identifier used to look up an event. All events of a deployment operation are logged with the same activityId. */
  var activityId: String = js.native
  
  /** Gets extended error text for the error if the deployment operation is not successful. */
  var errorText: String = js.native
  
  /** The extended error code can be used to distinguish a specific error condition which needs to be handled differently from the general error indicated by the return code. The extended error code may provide a more specific reason for the failure that caused the general error. Also, it usually corresponds directly to the specific message in the ErrorText . */
  var extendedErrorCode: WinRTError = js.native
}
object DeploymentResult {
  
  @scala.inline
  def apply(activityId: String, errorText: String, extendedErrorCode: WinRTError): DeploymentResult = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentResult]
  }
  
  @scala.inline
  implicit class DeploymentResultMutableBuilder[Self <: DeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedErrorCode(value: WinRTError): Self = StObject.set(x, "extendedErrorCode", value.asInstanceOf[js.Any])
  }
}
