package typingsSlinky.typedGithubApi.webHooksMod

import typingsSlinky.typedGithubApi.issueMod.Issue
import typingsSlinky.typedGithubApi.labelMod.Label
import typingsSlinky.typedGithubApi.typedGithubApiStrings.labeled
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unlabeled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueLabeledEvent extends IssueEvent {
  @JSName("action")
  var action_IssueLabeledEvent: labeled | unlabeled = js.native
  var label: Label = js.native
}

object IssueLabeledEvent {
  @scala.inline
  def apply(action: labeled | unlabeled, issue: Issue, label: Label): IssueLabeledEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueLabeledEvent]
  }
  @scala.inline
  implicit class IssueLabeledEventOps[Self <: IssueLabeledEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: labeled | unlabeled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

