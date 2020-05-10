package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecentMentionWorkItemModel extends js.Object {
  /**
    * Assigned To
    */
  var assignedTo: String = js.native
  /**
    * Work Item Id
    */
  var id: Double = js.native
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: js.Date = js.native
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

object AccountRecentMentionWorkItemModel {
  @scala.inline
  def apply(
    assignedTo: String,
    id: Double,
    mentionedDateField: js.Date,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentMentionWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mentionedDateField = mentionedDateField.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentMentionWorkItemModel]
  }
  @scala.inline
  implicit class AccountRecentMentionWorkItemModelOps[Self <: AccountRecentMentionWorkItemModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMentionedDateField(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentionedDateField")(value.asInstanceOf[js.Any])
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

