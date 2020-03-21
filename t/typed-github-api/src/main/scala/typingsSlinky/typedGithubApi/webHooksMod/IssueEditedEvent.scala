package typingsSlinky.typedGithubApi.webHooksMod

import typingsSlinky.typedGithubApi.AnonBody
import typingsSlinky.typedGithubApi.issueMod.Issue
import typingsSlinky.typedGithubApi.typedGithubApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited
  var changes: AnonBody
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: AnonBody, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueEditedEvent]
  }
}

