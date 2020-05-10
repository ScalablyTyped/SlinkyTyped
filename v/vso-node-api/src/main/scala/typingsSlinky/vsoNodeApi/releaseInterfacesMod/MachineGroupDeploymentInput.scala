package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineGroupDeploymentInput extends DeploymentInput {
  var deploymentHealthOption: String = js.native
  var healthPercent: Double = js.native
  var tags: js.Array[String] = js.native
}

object MachineGroupDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    deploymentHealthOption: String,
    enableAccessToken: Boolean,
    healthPercent: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    tags: js.Array[String],
    timeoutInMinutes: Double
  ): MachineGroupDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deploymentHealthOption = deploymentHealthOption.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], healthPercent = healthPercent.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineGroupDeploymentInput]
  }
  @scala.inline
  implicit class MachineGroupDeploymentInputOps[Self <: MachineGroupDeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentHealthOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentHealthOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

