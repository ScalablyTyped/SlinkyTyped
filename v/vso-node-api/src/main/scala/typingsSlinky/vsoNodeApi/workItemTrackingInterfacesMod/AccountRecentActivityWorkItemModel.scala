package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecentActivityWorkItemModel extends js.Object {
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
  implicit class AccountRecentActivityWorkItemModelOps[Self <: AccountRecentActivityWorkItemModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityType(value: WorkItemRecentActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

