package typingsSlinky.vsslnParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.vsslnParser.mod.VsSolutionSectionCollection because Already inherited */ @js.native
trait VsSolutionFile extends VsSolutionSection {
  var minimumVisualStudioVersion: js.UndefOr[String] = js.native
  var nestedProjects: js.UndefOr[VsSolutionSection] = js.native
  var projectConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.native
  var projects: js.Array[VsSolutionProject] = js.native
  var solutionConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.native
  var solutionProperties: js.UndefOr[VsSolutionSection] = js.native
  var teamFoundationVersionControl: js.UndefOr[VsSolutionSection] = js.native
  var visualStudioVersion: js.UndefOr[String] = js.native
}

object VsSolutionFile {
  @scala.inline
  def apply(projects: js.Array[VsSolutionProject]): VsSolutionFile = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsSolutionFile]
  }
  @scala.inline
  implicit class VsSolutionFileOps[Self <: VsSolutionFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjects(value: js.Array[VsSolutionProject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumVisualStudioVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVisualStudioVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumVisualStudioVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVisualStudioVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedProjects(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedProjects")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectConfigurationPlatforms(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfigurationPlatforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectConfigurationPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfigurationPlatforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionConfigurationPlatforms(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionConfigurationPlatforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionConfigurationPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionConfigurationPlatforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionProperties(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamFoundationVersionControl(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamFoundationVersionControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamFoundationVersionControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamFoundationVersionControl")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualStudioVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStudioVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualStudioVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualStudioVersion")(js.undefined)
        ret
    }
  }
  
}

