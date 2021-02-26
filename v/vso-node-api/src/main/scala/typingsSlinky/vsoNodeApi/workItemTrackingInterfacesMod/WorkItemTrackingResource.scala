package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTrackingResource extends WorkItemTrackingResourceReference {
  
  /**
    * Link references to related REST resources.
    */
  var _links: js.Any = js.native
}
object WorkItemTrackingResource {
  
  @scala.inline
  def apply(_links: js.Any, url: String): WorkItemTrackingResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingResource]
  }
  
  @scala.inline
  implicit class WorkItemTrackingResourceMutableBuilder[Self <: WorkItemTrackingResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
