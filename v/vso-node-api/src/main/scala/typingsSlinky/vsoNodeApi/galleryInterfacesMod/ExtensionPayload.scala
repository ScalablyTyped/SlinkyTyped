package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPayload extends js.Object {
  var description: String = js.native
  var displayName: String = js.native
  var fileName: String = js.native
  var installationTargets: js.Array[InstallationTarget] = js.native
  var isSignedByMicrosoft: Boolean = js.native
  var isValid: Boolean = js.native
  var metadata: js.Array[KeyValue] = js.native
  var `type`: ExtensionDeploymentTechnology = js.native
}

object ExtensionPayload {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    fileName: String,
    installationTargets: js.Array[InstallationTarget],
    isSignedByMicrosoft: Boolean,
    isValid: Boolean,
    metadata: js.Array[KeyValue],
    `type`: ExtensionDeploymentTechnology
  ): ExtensionPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], isSignedByMicrosoft = isSignedByMicrosoft.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPayload]
  }
  @scala.inline
  implicit class ExtensionPayloadOps[Self <: ExtensionPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargets(value: js.Array[InstallationTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSignedByMicrosoft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSignedByMicrosoft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ExtensionDeploymentTechnology): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

