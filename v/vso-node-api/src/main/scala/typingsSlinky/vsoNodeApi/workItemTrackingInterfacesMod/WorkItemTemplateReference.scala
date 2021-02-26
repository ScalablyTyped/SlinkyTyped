package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTemplateReference extends WorkItemTrackingResource {
  
  /**
    * The description of the work item template.
    */
  var description: String = js.native
  
  /**
    * The identifier of the work item template.
    */
  var id: String = js.native
  
  /**
    * The name of the work item template.
    */
  var name: String = js.native
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String = js.native
}
object WorkItemTemplateReference {
  
  @scala.inline
  def apply(
    _links: js.Any,
    description: String,
    id: String,
    name: String,
    url: String,
    workItemTypeName: String
  ): WorkItemTemplateReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTemplateReference]
  }
  
  @scala.inline
  implicit class WorkItemTemplateReferenceMutableBuilder[Self <: WorkItemTemplateReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
