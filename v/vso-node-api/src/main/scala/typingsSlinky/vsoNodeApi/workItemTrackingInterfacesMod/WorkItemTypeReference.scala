package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeReference extends WorkItemTrackingResourceReference {
  
  /**
    * Name of the work item type.
    */
  var name: String = js.native
}
object WorkItemTypeReference {
  
  @scala.inline
  def apply(name: String, url: String): WorkItemTypeReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeReference]
  }
  
  @scala.inline
  implicit class WorkItemTypeReferenceMutableBuilder[Self <: WorkItemTypeReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
