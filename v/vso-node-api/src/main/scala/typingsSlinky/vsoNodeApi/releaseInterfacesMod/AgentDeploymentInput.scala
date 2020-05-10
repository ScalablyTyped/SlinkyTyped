package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentDeploymentInput extends DeploymentInput {
  var imageId: Double = js.native
  var parallelExecution: ExecutionInput = js.native
}

object AgentDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    enableAccessToken: Boolean,
    imageId: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): AgentDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], parallelExecution = parallelExecution.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentDeploymentInput]
  }
  @scala.inline
  implicit class AgentDeploymentInputOps[Self <: AgentDeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallelExecution(value: ExecutionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelExecution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

