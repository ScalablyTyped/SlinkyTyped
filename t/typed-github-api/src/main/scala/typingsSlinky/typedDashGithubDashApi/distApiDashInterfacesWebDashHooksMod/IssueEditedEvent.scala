package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesWebDashHooksMod

import typingsSlinky.typedDashGithubDashApi.Anon_Body
import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited
  var changes: Anon_Body
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: Anon_Body, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueEditedEvent]
  }
}

