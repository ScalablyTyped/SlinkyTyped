package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRecentActivityWorkItemModel extends StObject {
  
  /**
    * Date of the last Activity by the user
    */
  var activityDate: js.Date = js.native
  
  /**
    * Type of the activity
    */
  var activityType: WorkItemRecentActivityType = js.native
  
  /**
    * Assigned To
    */
  var assignedTo: String = js.native
  
  /**
    * Last changed date of the work item
    */
  var changedDate: js.Date = js.native
  
  /**
    * Work Item Id
    */
  var id: Double = js.native
  
  /**
    * TeamFoundationId of the user this activity belongs to
    */
  var identityId: String = js.native
  
  /**
    * State of the work item
    */
  var state: String = js.native
  
  /**
    * Team project the work item belongs to
    */
  var teamProject: String = js.native
  
  /**
    * Title of the work item
    */
  var title: String = js.native
  
  /**
    * Type of Work Item
    */
  var workItemType: String = js.native
}
object AccountRecentActivityWorkItemModel {
  
  @scala.inline
  def apply(
    activityDate: js.Date,
    activityType: WorkItemRecentActivityType,
    assignedTo: String,
    changedDate: js.Date,
    id: Double,
    identityId: String,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentActivityWorkItemModel = {
    val __obj = js.Dynamic.literal(activityDate = activityDate.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], assignedTo = assignedTo.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentActivityWorkItemModel]
  }
  
  @scala.inline
  implicit class AccountRecentActivityWorkItemModelMutableBuilder[Self <: AccountRecentActivityWorkItemModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityDate(value: js.Date): Self = StObject.set(x, "activityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: WorkItemRecentActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: js.Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "identityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: String): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemType(value: String): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
