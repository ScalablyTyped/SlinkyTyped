package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactVersion extends js.Object {
  var alias: String = js.native
  var defaultVersion: BuildVersion = js.native
  var errorMessage: String = js.native
  var sourceId: String = js.native
  var versions: js.Array[BuildVersion] = js.native
}

object ArtifactVersion {
  @scala.inline
  def apply(
    alias: String,
    defaultVersion: BuildVersion,
    errorMessage: String,
    sourceId: String,
    versions: js.Array[BuildVersion]
  ): ArtifactVersion = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersion]
  }
  @scala.inline
  implicit class ArtifactVersionOps[Self <: ArtifactVersion] (val x: Self) extends AnyVal {
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
    def withDefaultVersion(value: BuildVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[BuildVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

