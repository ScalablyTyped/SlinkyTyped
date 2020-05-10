package typingsSlinky.typedGithubApi.webHooksMod

import typingsSlinky.typedGithubApi.issueMod.Issue
import typingsSlinky.typedGithubApi.typedGithubApiStrings.assigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unassigned
import typingsSlinky.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueAssignedEvent extends IssueEvent {
  @JSName("action")
  var action_IssueAssignedEvent: assigned | unassigned = js.native
  var assignee: UserSummary = js.native
}

object IssueAssignedEvent {
  @scala.inline
  def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueAssignedEvent]
  }
  @scala.inline
  implicit class IssueAssignedEventOps[Self <: IssueAssignedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: assigned | unassigned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee(value: UserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

