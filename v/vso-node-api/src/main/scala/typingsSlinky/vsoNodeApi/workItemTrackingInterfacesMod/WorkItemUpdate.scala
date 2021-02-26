package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemUpdate extends WorkItemTrackingResource {
  
  /**
    * List of updates to fields.
    */
  var fields: StringDictionary[WorkItemFieldUpdate] = js.native
  
  /**
    * ID of update.
    */
  var id: Double = js.native
  
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates = js.native
  
  /**
    * The revision number of work item update.
    */
  var rev: Double = js.native
  
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference = js.native
  
  /**
    * The work item updates revision date.
    */
  var revisedDate: js.Date = js.native
  
  /**
    * The work item ID.
    */
  var workItemId: Double = js.native
}
object WorkItemUpdate {
  
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[WorkItemFieldUpdate],
    id: Double,
    relations: WorkItemRelationUpdates,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: js.Date,
    url: String,
    workItemId: Double
  ): WorkItemUpdate = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemId = workItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemUpdate]
  }
  
  @scala.inline
  implicit class WorkItemUpdateMutableBuilder[Self <: WorkItemUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[WorkItemFieldUpdate]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: WorkItemRelationUpdates): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisedBy(value: IdentityReference): Self = StObject.set(x, "revisedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisedDate(value: js.Date): Self = StObject.set(x, "revisedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemId(value: Double): Self = StObject.set(x, "workItemId", value.asInstanceOf[js.Any])
  }
}
