package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArtifactSource extends js.Object {
  @JSName("package")
  var _package: Double = js.native
  var artifactSource: Double = js.native
  var containerImage: Double = js.native
  var pullRequest: Double = js.native
  var schedule: Double = js.native
  var sourceRepo: Double = js.native
  var undefined: Double = js.native
}

object AnonArtifactSource {
  @scala.inline
  def apply(
    _package: Double,
    artifactSource: Double,
    containerImage: Double,
    pullRequest: Double,
    schedule: Double,
    sourceRepo: Double,
    undefined: Double
  ): AnonArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtifactSource]
  }
  @scala.inline
  implicit class AnonArtifactSourceOps[Self <: AnonArtifactSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerImage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRepo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

