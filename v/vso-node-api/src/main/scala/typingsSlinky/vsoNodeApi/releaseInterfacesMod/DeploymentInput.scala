package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentInput extends BaseDeploymentInput {
  var artifactsDownloadInput: ArtifactsDownloadInput = js.native
  var demands: js.Array[_] = js.native
  var enableAccessToken: Boolean = js.native
  var queueId: Double = js.native
  var skipArtifactsDownload: Boolean = js.native
}

object DeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    enableAccessToken: Boolean,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): DeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentInput]
  }
  @scala.inline
  implicit class DeploymentInputOps[Self <: DeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactsDownloadInput(value: ArtifactsDownloadInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactsDownloadInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAccessToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipArtifactsDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipArtifactsDownload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

