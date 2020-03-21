package typingsSlinky.typedGithubApi.webHooksMod

import typingsSlinky.typedGithubApi.issueMod.Issue
import typingsSlinky.typedGithubApi.typedGithubApiStrings.assigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.demilestoned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.edited
import typingsSlinky.typedGithubApi.typedGithubApiStrings.labeled
import typingsSlinky.typedGithubApi.typedGithubApiStrings.milestoned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.opened
import typingsSlinky.typedGithubApi.typedGithubApiStrings.reopened
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unassigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unlabeled
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

