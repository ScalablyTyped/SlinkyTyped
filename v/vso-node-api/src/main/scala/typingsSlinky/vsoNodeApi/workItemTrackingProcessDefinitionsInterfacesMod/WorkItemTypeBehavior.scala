package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeBehavior extends StObject {
  
  var behavior: WorkItemBehaviorReference = js.native
  
  var isDefault: Boolean = js.native
  
  var url: String = js.native
}
object WorkItemTypeBehavior {
  
  @scala.inline
  def apply(behavior: WorkItemBehaviorReference, isDefault: Boolean, url: String): WorkItemTypeBehavior = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeBehavior]
  }
  
  @scala.inline
  implicit class WorkItemTypeBehaviorMutableBuilder[Self <: WorkItemTypeBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: WorkItemBehaviorReference): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
