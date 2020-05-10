package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArtifactAddedEvent extends BuildUpdatedEvent {
  var artifact: BuildArtifact = js.native
}

object BuildArtifactAddedEvent {
  @scala.inline
  def apply(artifact: BuildArtifact, build: Build, buildId: Double): BuildArtifactAddedEvent = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactAddedEvent]
  }
  @scala.inline
  implicit class BuildArtifactAddedEventOps[Self <: BuildArtifactAddedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifact(value: BuildArtifact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

