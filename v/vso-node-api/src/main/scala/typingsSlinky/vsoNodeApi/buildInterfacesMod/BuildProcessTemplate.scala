package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildProcessTemplate extends js.Object {
  var description: String = js.native
  var fileExists: Boolean = js.native
  var id: Double = js.native
  var parameters: String = js.native
  var serverPath: String = js.native
  var supportedReasons: BuildReason = js.native
  var teamProject: String = js.native
  var templateType: ProcessTemplateType = js.native
  var url: String = js.native
  var version: String = js.native
}

object BuildProcessTemplate {
  @scala.inline
  def apply(
    description: String,
    fileExists: Boolean,
    id: Double,
    parameters: String,
    serverPath: String,
    supportedReasons: BuildReason,
    teamProject: String,
    templateType: ProcessTemplateType,
    url: String,
    version: String
  ): BuildProcessTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileExists = fileExists.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any], supportedReasons = supportedReasons.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcessTemplate]
  }
  @scala.inline
  implicit class BuildProcessTemplateOps[Self <: BuildProcessTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedReasons(value: BuildReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateType(value: ProcessTemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

