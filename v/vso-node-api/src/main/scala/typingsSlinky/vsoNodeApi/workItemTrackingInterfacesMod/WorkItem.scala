package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItem extends WorkItemTrackingResource {
  
  /**
    * Map of field and values for the work item.
    */
  var fields: StringDictionary[js.Any] = js.native
  
  /**
    * The work item ID.
    */
  var id: Double = js.native
  
  /**
    * Relations of the work item.
    */
  var relations: js.Array[WorkItemRelation] = js.native
  
  /**
    * Revision number of the work item.
    */
  var rev: Double = js.native
}
object WorkItem {
  
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[js.Any],
    id: Double,
    relations: js.Array[WorkItemRelation],
    rev: Double,
    url: String
  ): WorkItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItem]
  }
  
  @scala.inline
  implicit class WorkItemMutableBuilder[Self <: WorkItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: js.Array[WorkItemRelation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsVarargs(value: WorkItemRelation*): Self = StObject.set(x, "relations", js.Array(value :_*))
    
    @scala.inline
    def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
