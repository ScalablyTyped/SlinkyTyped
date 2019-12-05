package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: assigned | unassigned
  var assignee: UserSummary
}

object IssueAssignedEvent {
  @scala.inline
  def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueAssignedEvent]
  }
}

