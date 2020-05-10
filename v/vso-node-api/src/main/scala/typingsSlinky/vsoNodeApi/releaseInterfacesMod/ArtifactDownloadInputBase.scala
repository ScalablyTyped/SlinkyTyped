package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactDownloadInputBase extends js.Object {
  var alias: String = js.native
  var artifactDownloadMode: String = js.native
  var artifactType: String = js.native
}

object ArtifactDownloadInputBase {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactType: String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
  @scala.inline
  implicit class ArtifactDownloadInputBaseOps[Self <: ArtifactDownloadInputBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactDownloadMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactDownloadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

