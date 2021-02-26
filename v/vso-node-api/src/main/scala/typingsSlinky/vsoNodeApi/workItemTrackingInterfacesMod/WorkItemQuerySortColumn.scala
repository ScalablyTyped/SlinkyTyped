package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemQuerySortColumn extends StObject {
  
  /**
    * The direction to sort by.
    */
  var descending: Boolean = js.native
  
  /**
    * A work item field.
    */
  var field: WorkItemFieldReference = js.native
}
object WorkItemQuerySortColumn {
  
  @scala.inline
  def apply(descending: Boolean, field: WorkItemFieldReference): WorkItemQuerySortColumn = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQuerySortColumn]
  }
  
  @scala.inline
  implicit class WorkItemQuerySortColumnMutableBuilder[Self <: WorkItemQuerySortColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: WorkItemFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
