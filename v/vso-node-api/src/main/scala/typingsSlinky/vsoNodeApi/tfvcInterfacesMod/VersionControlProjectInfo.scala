package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.SourceControlTypes
import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionControlProjectInfo extends js.Object {
  var defaultSourceControlType: SourceControlTypes = js.native
  var project: TeamProjectReference = js.native
  var supportsGit: Boolean = js.native
  var supportsTFVC: Boolean = js.native
}

object VersionControlProjectInfo {
  @scala.inline
  def apply(
    defaultSourceControlType: SourceControlTypes,
    project: TeamProjectReference,
    supportsGit: Boolean,
    supportsTFVC: Boolean
  ): VersionControlProjectInfo = {
    val __obj = js.Dynamic.literal(defaultSourceControlType = defaultSourceControlType.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], supportsGit = supportsGit.asInstanceOf[js.Any], supportsTFVC = supportsTFVC.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
  @scala.inline
  implicit class VersionControlProjectInfoOps[Self <: VersionControlProjectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSourceControlType(value: SourceControlTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSourceControlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsGit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsGit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsTFVC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTFVC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

