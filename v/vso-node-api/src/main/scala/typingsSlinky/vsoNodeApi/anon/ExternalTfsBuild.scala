package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalTfsBuild extends js.Object {
  var build: scala.Double = js.native
  var custom: scala.Double = js.native
  var externalTfsBuild: scala.Double = js.native
  var fileShare: scala.Double = js.native
  var gitHub: scala.Double = js.native
  var jenkins: scala.Double = js.native
  var nuget: scala.Double = js.native
  var tFGit: scala.Double = js.native
  var tfsOnPrem: scala.Double = js.native
  var tfvc: scala.Double = js.native
  var xamlBuild: scala.Double = js.native
}

object ExternalTfsBuild {
  @scala.inline
  def apply(
    build: scala.Double,
    custom: scala.Double,
    externalTfsBuild: scala.Double,
    fileShare: scala.Double,
    gitHub: scala.Double,
    jenkins: scala.Double,
    nuget: scala.Double,
    tFGit: scala.Double,
    tfsOnPrem: scala.Double,
    tfvc: scala.Double,
    xamlBuild: scala.Double
  ): ExternalTfsBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], externalTfsBuild = externalTfsBuild.asInstanceOf[js.Any], fileShare = fileShare.asInstanceOf[js.Any], gitHub = gitHub.asInstanceOf[js.Any], jenkins = jenkins.asInstanceOf[js.Any], nuget = nuget.asInstanceOf[js.Any], tFGit = tFGit.asInstanceOf[js.Any], tfsOnPrem = tfsOnPrem.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any], xamlBuild = xamlBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalTfsBuild]
  }
  @scala.inline
  implicit class ExternalTfsBuildOps[Self <: ExternalTfsBuild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalTfsBuild(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalTfsBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileShare(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitHub(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJenkins(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jenkins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNuget(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nuget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTFGit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tFGit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfsOnPrem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfsOnPrem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvc(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXamlBuild(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xamlBuild")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

