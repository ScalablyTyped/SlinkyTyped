package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDeployment extends js.Object {
  var deployment: BuildSummary = js.native
  var sourceBuild: XamlBuildReference = js.native
}

object BuildDeployment {
  @scala.inline
  def apply(deployment: BuildSummary, sourceBuild: XamlBuildReference): BuildDeployment = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], sourceBuild = sourceBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeployment]
  }
  @scala.inline
  implicit class BuildDeploymentOps[Self <: BuildDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: BuildSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBuild(value: XamlBuildReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBuild")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

