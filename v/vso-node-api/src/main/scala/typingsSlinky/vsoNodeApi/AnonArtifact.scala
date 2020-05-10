package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArtifact extends js.Object {
  var artifact: Double = js.native
  var environmentState: Double = js.native
  var event: Double = js.native
  var undefined: Double = js.native
}

object AnonArtifact {
  @scala.inline
  def apply(artifact: Double, environmentState: Double, event: Double, undefined: Double): AnonArtifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], environmentState = environmentState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtifact]
  }
  @scala.inline
  implicit class AnonArtifactOps[Self <: AnonArtifact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
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

