package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoTriggerIssue extends js.Object {
  var issue: Issue = js.native
  var issueSource: IssueSource = js.native
  var project: ProjectReference = js.native
  var releaseDefinitionReference: ReleaseDefinitionShallowReference = js.native
  var releaseTriggerType: ReleaseTriggerType = js.native
}

object AutoTriggerIssue {
  @scala.inline
  def apply(
    issue: Issue,
    issueSource: IssueSource,
    project: ProjectReference,
    releaseDefinitionReference: ReleaseDefinitionShallowReference,
    releaseTriggerType: ReleaseTriggerType
  ): AutoTriggerIssue = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], issueSource = issueSource.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseDefinitionReference = releaseDefinitionReference.asInstanceOf[js.Any], releaseTriggerType = releaseTriggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTriggerIssue]
  }
  @scala.inline
  implicit class AutoTriggerIssueOps[Self <: AutoTriggerIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssue(value: Issue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssueSource(value: IssueSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDefinitionReference(value: ReleaseDefinitionShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDefinitionReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseTriggerType(value: ReleaseTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseTriggerType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

