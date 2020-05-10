package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessConfiguration extends js.Object {
  /**
    * Details about bug work items
    */
  var bugWorkItems: CategoryConfiguration = js.native
  /**
    * Details about portfolio backlogs
    */
  var portfolioBacklogs: js.Array[CategoryConfiguration] = js.native
  /**
    * Details of requirement backlog
    */
  var requirementBacklog: CategoryConfiguration = js.native
  /**
    * Details of task backlog
    */
  var taskBacklog: CategoryConfiguration = js.native
  /**
    * Type fields for the process configuration
    */
  var typeFields: StringDictionary[WorkItemFieldReference] = js.native
  var url: String = js.native
}

object ProcessConfiguration {
  @scala.inline
  def apply(
    bugWorkItems: CategoryConfiguration,
    portfolioBacklogs: js.Array[CategoryConfiguration],
    requirementBacklog: CategoryConfiguration,
    taskBacklog: CategoryConfiguration,
    typeFields: StringDictionary[WorkItemFieldReference],
    url: String
  ): ProcessConfiguration = {
    val __obj = js.Dynamic.literal(bugWorkItems = bugWorkItems.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], typeFields = typeFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessConfiguration]
  }
  @scala.inline
  implicit class ProcessConfigurationOps[Self <: ProcessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBugWorkItems(value: CategoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortfolioBacklogs(value: js.Array[CategoryConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portfolioBacklogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirementBacklog(value: CategoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirementBacklog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskBacklog(value: CategoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskBacklog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeFields(value: StringDictionary[WorkItemFieldReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

