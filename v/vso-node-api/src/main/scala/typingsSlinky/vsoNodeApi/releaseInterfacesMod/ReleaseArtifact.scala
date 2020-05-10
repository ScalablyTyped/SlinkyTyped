package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseArtifact extends js.Object {
  var artifactProvider: ArtifactProvider = js.native
  var artifactType: String = js.native
  var definitionData: String = js.native
  var definitionId: Double = js.native
  var description: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var releaseId: Double = js.native
}

object ReleaseArtifact {
  @scala.inline
  def apply(
    artifactProvider: ArtifactProvider,
    artifactType: String,
    definitionData: String,
    definitionId: Double,
    description: String,
    id: Double,
    name: String,
    releaseId: Double
  ): ReleaseArtifact = {
    val __obj = js.Dynamic.literal(artifactProvider = artifactProvider.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], definitionData = definitionData.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseArtifact]
  }
  @scala.inline
  implicit class ReleaseArtifactOps[Self <: ReleaseArtifact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactProvider(value: ArtifactProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

