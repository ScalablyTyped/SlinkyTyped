package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactSourceTrigger extends ReleaseTriggerBase {
  /**
    * Artifact source alias for Artifact Source trigger type
    */
  var artifactAlias: String = js.native
  var triggerConditions: js.Array[ArtifactFilter] = js.native
}

object ArtifactSourceTrigger {
  @scala.inline
  def apply(
    artifactAlias: String,
    triggerConditions: js.Array[ArtifactFilter],
    triggerType: ReleaseTriggerType
  ): ArtifactSourceTrigger = {
    val __obj = js.Dynamic.literal(artifactAlias = artifactAlias.asInstanceOf[js.Any], triggerConditions = triggerConditions.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceTrigger]
  }
  @scala.inline
  implicit class ArtifactSourceTriggerOps[Self <: ArtifactSourceTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerConditions(value: js.Array[ArtifactFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerConditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

