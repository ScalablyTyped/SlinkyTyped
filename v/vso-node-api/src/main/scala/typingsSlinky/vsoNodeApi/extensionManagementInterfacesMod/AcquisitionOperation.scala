package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquisitionOperation extends StObject {
  
  /**
    * State of the the AcquisitionOperation for the current user
    */
  var operationState: AcquisitionOperationState = js.native
  
  /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
  var operationType: AcquisitionOperationType = js.native
  
  /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
  var reason: String = js.native
  
  /**
    * List of reasons indicating why the operation is not allowed.
    */
  var reasons: js.Array[AcquisitionOperationDisallowReason] = js.native
}
object AcquisitionOperation {
  
  @scala.inline
  def apply(
    operationState: AcquisitionOperationState,
    operationType: AcquisitionOperationType,
    reason: String,
    reasons: js.Array[AcquisitionOperationDisallowReason]
  ): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperation]
  }
  
  @scala.inline
  implicit class AcquisitionOperationMutableBuilder[Self <: AcquisitionOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationState(value: AcquisitionOperationState): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: AcquisitionOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasons(value: js.Array[AcquisitionOperationDisallowReason]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsVarargs(value: AcquisitionOperationDisallowReason*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
