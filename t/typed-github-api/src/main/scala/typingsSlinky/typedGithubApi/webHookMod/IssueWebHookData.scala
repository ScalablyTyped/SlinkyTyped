package typingsSlinky.typedGithubApi.webHookMod

import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
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

@js.native
trait IssueWebHookData extends WebHookData {
  @JSName("action")
  var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened = js.native
  var issue: Issue = js.native
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
  @scala.inline
  implicit class IssueWebHookDataOps[Self <: IssueWebHookData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(
      value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: Issue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

