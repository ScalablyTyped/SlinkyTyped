package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTrackingResourceReference extends StObject {
  
  var url: String = js.native
}
object WorkItemTrackingResourceReference {
  
  @scala.inline
  def apply(url: String): WorkItemTrackingResourceReference = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingResourceReference]
  }
  
  @scala.inline
  implicit class WorkItemTrackingResourceReferenceMutableBuilder[Self <: WorkItemTrackingResourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
