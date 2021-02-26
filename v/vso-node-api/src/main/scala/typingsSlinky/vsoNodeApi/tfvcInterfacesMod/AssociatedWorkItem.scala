package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedWorkItem extends StObject {
  
  var assignedTo: String = js.native
  
  /**
    * Id of associated the work item.
    */
  var id: Double = js.native
  
  var state: String = js.native
  
  var title: String = js.native
  
  /**
    * REST Url of the work item.
    */
  var url: String = js.native
  
  var webUrl: String = js.native
  
  var workItemType: String = js.native
}
object AssociatedWorkItem {
  
  @scala.inline
  def apply(
    assignedTo: String,
    id: Double,
    state: String,
    title: String,
    url: String,
    webUrl: String,
    workItemType: String
  ): AssociatedWorkItem = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedWorkItem]
  }
  
  @scala.inline
  implicit class AssociatedWorkItemMutableBuilder[Self <: AssociatedWorkItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemType(value: String): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
