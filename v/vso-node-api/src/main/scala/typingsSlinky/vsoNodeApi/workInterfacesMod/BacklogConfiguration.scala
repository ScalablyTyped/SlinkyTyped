package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogConfiguration extends js.Object {
  /**
    * Behavior/type field mapping
    */
  var backlogFields: BacklogFields = js.native
  /**
    * Bugs behavior
    */
  var bugsBehavior: BugsBehavior = js.native
  /**
    * Hidden Backlog
    */
  var hiddenBacklogs: js.Array[String] = js.native
  /**
    * Portfolio backlog descriptors
    */
  var portfolioBacklogs: js.Array[BacklogLevelConfiguration] = js.native
  /**
    * Requirement backlog
    */
  var requirementBacklog: BacklogLevelConfiguration = js.native
  /**
    * Task backlog
    */
  var taskBacklog: BacklogLevelConfiguration = js.native
  var url: String = js.native
  /**
    * Mapped states for work item types
    */
  var workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo] = js.native
}

object BacklogConfiguration {
  @scala.inline
  def apply(
    backlogFields: BacklogFields,
    bugsBehavior: BugsBehavior,
    hiddenBacklogs: js.Array[String],
    portfolioBacklogs: js.Array[BacklogLevelConfiguration],
    requirementBacklog: BacklogLevelConfiguration,
    taskBacklog: BacklogLevelConfiguration,
    url: String,
    workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
  ): BacklogConfiguration = {
    val __obj = js.Dynamic.literal(backlogFields = backlogFields.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], hiddenBacklogs = hiddenBacklogs.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeMappedStates = workItemTypeMappedStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogConfiguration]
  }
  @scala.inline
  implicit class BacklogConfigurationOps[Self <: BacklogConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklogFields(value: BacklogFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlogFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBugsBehavior(value: BugsBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugsBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenBacklogs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenBacklogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortfolioBacklogs(value: js.Array[BacklogLevelConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portfolioBacklogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirementBacklog(value: BacklogLevelConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirementBacklog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskBacklog(value: BacklogLevelConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskBacklog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypeMappedStates(value: js.Array[WorkItemTypeStateInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypeMappedStates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

