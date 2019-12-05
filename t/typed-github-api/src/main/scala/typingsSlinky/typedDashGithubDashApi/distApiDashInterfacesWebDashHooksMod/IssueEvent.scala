package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.assigned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.demilestoned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.labeled
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.milestoned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.opened
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.reopened
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.unassigned
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEvent extends Event {
  @JSName("action")
  var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueEvent {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    issue: Issue
  ): IssueEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueEvent]
  }
}

