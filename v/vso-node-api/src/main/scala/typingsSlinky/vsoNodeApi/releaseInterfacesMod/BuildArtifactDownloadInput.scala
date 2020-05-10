package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildArtifactDownloadInput extends ArtifactDownloadInputBase {
  var artifactItems: js.Array[String] = js.native
}

object BuildArtifactDownloadInput {
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): BuildArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactItems = artifactItems.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactDownloadInput]
  }
  @scala.inline
  implicit class BuildArtifactDownloadInputOps[Self <: BuildArtifactDownloadInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

