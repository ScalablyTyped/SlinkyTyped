package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  var artifact: scala.Double = js.native
  var environmentState: scala.Double = js.native
  var event: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object Artifact {
  @scala.inline
  def apply(
    artifact: scala.Double,
    environmentState: scala.Double,
    event: scala.Double,
    undefined: scala.Double
  ): Artifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], environmentState = environmentState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifact(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentState(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
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

