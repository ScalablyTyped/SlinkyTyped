package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeTemplateUpdateModel extends StObject {
  
  /**
    * Describes the type of the action for the update request.
    */
  var actionType: ProvisioningActionType = js.native
  
  /**
    * Methodology to which the template belongs, eg. Agile, Scrum, CMMI.
    */
  var methodology: String = js.native
  
  /**
    * String representation of the work item type template.
    */
  var template: String = js.native
  
  /**
    * The type of the template described in the request body.
    */
  var templateType: TemplateType = js.native
}
object WorkItemTypeTemplateUpdateModel {
  
  @scala.inline
  def apply(
    actionType: ProvisioningActionType,
    methodology: String,
    template: String,
    templateType: TemplateType
  ): WorkItemTypeTemplateUpdateModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], methodology = methodology.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeTemplateUpdateModel]
  }
  
  @scala.inline
  implicit class WorkItemTypeTemplateUpdateModelMutableBuilder[Self <: WorkItemTypeTemplateUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: ProvisioningActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodology(value: String): Self = StObject.set(x, "methodology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
  }
}
