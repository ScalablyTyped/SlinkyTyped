package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactSourceId extends js.Object {
  var artifactTypeId: String = js.native
  var sourceIdInputs: js.Array[SourceIdInput] = js.native
}

object ArtifactSourceId {
  @scala.inline
  def apply(artifactTypeId: String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal(artifactTypeId = artifactTypeId.asInstanceOf[js.Any], sourceIdInputs = sourceIdInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceId]
  }
  @scala.inline
  implicit class ArtifactSourceIdOps[Self <: ArtifactSourceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIdInputs(value: js.Array[SourceIdInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIdInputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

