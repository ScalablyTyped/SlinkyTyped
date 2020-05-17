package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionVersion extends js.Object {
  var assetUri: String = js.native
  var badges: js.Array[ExtensionBadge] = js.native
  var fallbackAssetUri: String = js.native
  var files: js.Array[ExtensionFile] = js.native
  var flags: ExtensionVersionFlags = js.native
  var lastUpdated: js.Date = js.native
  var properties: js.Array[KeyValue] = js.native
  var validationResultMessage: String = js.native
  var version: String = js.native
  var versionDescription: String = js.native
}

object ExtensionVersion {
  @scala.inline
  def apply(
    assetUri: String,
    badges: js.Array[ExtensionBadge],
    fallbackAssetUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionVersionFlags,
    lastUpdated: js.Date,
    properties: js.Array[KeyValue],
    validationResultMessage: String,
    version: String,
    versionDescription: String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal(assetUri = assetUri.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], fallbackAssetUri = fallbackAssetUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], validationResultMessage = validationResultMessage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionVersion]
  }
  @scala.inline
  implicit class ExtensionVersionOps[Self <: ExtensionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadges(value: js.Array[ExtensionBadge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackAssetUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackAssetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[ExtensionFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: ExtensionVersionFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

