package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExternalTfsBuild extends js.Object {
  var build: Double = js.native
  var custom: Double = js.native
  var externalTfsBuild: Double = js.native
  var fileShare: Double = js.native
  var gitHub: Double = js.native
  var jenkins: Double = js.native
  var nuget: Double = js.native
  var tFGit: Double = js.native
  var tfsOnPrem: Double = js.native
  var tfvc: Double = js.native
  var xamlBuild: Double = js.native
}

object AnonExternalTfsBuild {
  @scala.inline
  def apply(
    build: Double,
    custom: Double,
    externalTfsBuild: Double,
    fileShare: Double,
    gitHub: Double,
    jenkins: Double,
    nuget: Double,
    tFGit: Double,
    tfsOnPrem: Double,
    tfvc: Double,
    xamlBuild: Double
  ): AnonExternalTfsBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], externalTfsBuild = externalTfsBuild.asInstanceOf[js.Any], fileShare = fileShare.asInstanceOf[js.Any], gitHub = gitHub.asInstanceOf[js.Any], jenkins = jenkins.asInstanceOf[js.Any], nuget = nuget.asInstanceOf[js.Any], tFGit = tFGit.asInstanceOf[js.Any], tfsOnPrem = tfsOnPrem.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any], xamlBuild = xamlBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalTfsBuild]
  }
  @scala.inline
  implicit class AnonExternalTfsBuildOps[Self <: AnonExternalTfsBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalTfsBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalTfsBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileShare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitHub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJenkins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jenkins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNuget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nuget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTFGit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tFGit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfsOnPrem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfsOnPrem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXamlBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xamlBuild")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

