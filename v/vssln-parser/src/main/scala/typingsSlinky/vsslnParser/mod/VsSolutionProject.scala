package typingsSlinky.vsslnParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.vsslnParser.mod.VsSolutionSectionCollection because Already inherited */ @js.native
trait VsSolutionProject extends VsSolutionSection {
  var name: String = js.native
  var path: String = js.native
  var projectDependencies: js.UndefOr[VsSolutionSection] = js.native
  var projectGuid: String = js.native
  var `type`: String = js.native
  var typeGuid: String = js.native
}

object VsSolutionProject {
  @scala.inline
  def apply(name: String, path: String, projectGuid: String, `type`: String, typeGuid: String): VsSolutionProject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectGuid = projectGuid.asInstanceOf[js.Any], typeGuid = typeGuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsSolutionProject]
  }
  @scala.inline
  implicit class VsSolutionProjectOps[Self <: VsSolutionProject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectDependencies(value: VsSolutionSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDependencies")(js.undefined)
        ret
    }
  }
  
}

