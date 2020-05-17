package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactSource extends js.Object {
  @JSName("package")
  var _package: scala.Double = js.native
  var artifactSource: scala.Double = js.native
  var containerImage: scala.Double = js.native
  var pullRequest: scala.Double = js.native
  var schedule: scala.Double = js.native
  var sourceRepo: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object ArtifactSource {
  @scala.inline
  def apply(
    _package: scala.Double,
    artifactSource: scala.Double,
    containerImage: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
  @scala.inline
  implicit class ArtifactSourceOps[Self <: ArtifactSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactSource(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerImage(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRepo(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

