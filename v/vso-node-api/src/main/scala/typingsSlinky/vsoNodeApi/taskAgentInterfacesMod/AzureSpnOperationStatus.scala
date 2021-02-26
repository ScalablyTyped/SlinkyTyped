package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureSpnOperationStatus extends StObject {
  
  var state: String = js.native
  
  var statusMessage: String = js.native
}
object AzureSpnOperationStatus {
  
  @scala.inline
  def apply(state: String, statusMessage: String): AzureSpnOperationStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSpnOperationStatus]
  }
  
  @scala.inline
  implicit class AzureSpnOperationStatusMutableBuilder[Self <: AzureSpnOperationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
