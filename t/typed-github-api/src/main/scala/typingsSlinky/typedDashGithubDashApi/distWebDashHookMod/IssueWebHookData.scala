package typingsSlinky.typedDashGithubDashApi.distWebDashHookMod

import typingsSlinky.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
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

trait IssueWebHookData extends WebHookData {
  @JSName("action")
  var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
  var issue: Issue
}

object IssueWebHookData {
  @scala.inline
  def apply(
    action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
    event: String,
    id: String,
    issue: Issue,
    sender: UserSummary
  ): IssueWebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueWebHookData]
  }
}

