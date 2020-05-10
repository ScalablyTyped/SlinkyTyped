package typingsSlinky.typedGithubApi.webHooksMod

import typingsSlinky.typedGithubApi.AnonBody
import typingsSlinky.typedGithubApi.issueMod.Issue
import typingsSlinky.typedGithubApi.typedGithubApiStrings.edited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueEditedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueEditedEvent: edited = js.native
  var changes: AnonBody = js.native
}

object IssueEditedEvent {
  @scala.inline
  def apply(action: edited, changes: AnonBody, issue: Issue): IssueEditedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueEditedEvent]
  }
  @scala.inline
  implicit class IssueEditedEventOps[Self <: IssueEditedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: edited): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanges(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

