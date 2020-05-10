package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactVersionQueryResult extends js.Object {
  var artifactVersions: js.Array[ArtifactVersion] = js.native
}

object ArtifactVersionQueryResult {
  @scala.inline
  def apply(artifactVersions: js.Array[ArtifactVersion]): ArtifactVersionQueryResult = {
    val __obj = js.Dynamic.literal(artifactVersions = artifactVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersionQueryResult]
  }
  @scala.inline
  implicit class ArtifactVersionQueryResultOps[Self <: ArtifactVersionQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactVersions(value: js.Array[ArtifactVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactVersions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

