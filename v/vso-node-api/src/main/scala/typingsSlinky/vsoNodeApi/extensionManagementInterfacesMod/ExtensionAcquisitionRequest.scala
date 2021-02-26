package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionAcquisitionRequest extends StObject {
  
  /**
    * How the item is being assigned
    */
  var assignmentType: AcquisitionAssignmentType = js.native
  
  /**
    * The id of the subscription used for purchase
    */
  var billingId: String = js.native
  
  /**
    * The marketplace id (publisherName.extensionName) for the item
    */
  var itemId: String = js.native
  
  /**
    * The type of operation, such as install, request, purchase
    */
  var operationType: AcquisitionOperationType = js.native
  
  /**
    * Additional properties which can be added to the request.
    */
  var properties: js.Any = js.native
  
  /**
    * How many licenses should be purchased
    */
  var quantity: Double = js.native
}
object ExtensionAcquisitionRequest {
  
  @scala.inline
  def apply(
    assignmentType: AcquisitionAssignmentType,
    billingId: String,
    itemId: String,
    operationType: AcquisitionOperationType,
    properties: js.Any,
    quantity: Double
  ): ExtensionAcquisitionRequest = {
    val __obj = js.Dynamic.literal(assignmentType = assignmentType.asInstanceOf[js.Any], billingId = billingId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAcquisitionRequest]
  }
  
  @scala.inline
  implicit class ExtensionAcquisitionRequestMutableBuilder[Self <: ExtensionAcquisitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentType(value: AcquisitionAssignmentType): Self = StObject.set(x, "assignmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: AcquisitionOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
