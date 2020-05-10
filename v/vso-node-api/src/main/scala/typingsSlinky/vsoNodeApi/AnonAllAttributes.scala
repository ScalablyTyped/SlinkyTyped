package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllAttributes extends js.Object {
  var allAttributes: Double = js.native
  var excludeNonValidated: Double = js.native
  var includeAssetUri: Double = js.native
  var includeCategoryAndTags: Double = js.native
  var includeFiles: Double = js.native
  var includeInstallationTargets: Double = js.native
  var includeLatestVersionOnly: Double = js.native
  var includeLcids: Double = js.native
  var includeMetadata: Double = js.native
  var includeMinimalPayloadForVsIde: Double = js.native
  var includeSharedAccounts: Double = js.native
  var includeStatistics: Double = js.native
  var includeVersionProperties: Double = js.native
  var includeVersions: Double = js.native
  var none: Double = js.native
  var useFallbackAssetUri: Double = js.native
}

object AnonAllAttributes {
  @scala.inline
  def apply(
    allAttributes: Double,
    excludeNonValidated: Double,
    includeAssetUri: Double,
    includeCategoryAndTags: Double,
    includeFiles: Double,
    includeInstallationTargets: Double,
    includeLatestVersionOnly: Double,
    includeLcids: Double,
    includeMetadata: Double,
    includeMinimalPayloadForVsIde: Double,
    includeSharedAccounts: Double,
    includeStatistics: Double,
    includeVersionProperties: Double,
    includeVersions: Double,
    none: Double,
    useFallbackAssetUri: Double
  ): AnonAllAttributes = {
    val __obj = js.Dynamic.literal(allAttributes = allAttributes.asInstanceOf[js.Any], excludeNonValidated = excludeNonValidated.asInstanceOf[js.Any], includeAssetUri = includeAssetUri.asInstanceOf[js.Any], includeCategoryAndTags = includeCategoryAndTags.asInstanceOf[js.Any], includeFiles = includeFiles.asInstanceOf[js.Any], includeInstallationTargets = includeInstallationTargets.asInstanceOf[js.Any], includeLatestVersionOnly = includeLatestVersionOnly.asInstanceOf[js.Any], includeLcids = includeLcids.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any], includeMinimalPayloadForVsIde = includeMinimalPayloadForVsIde.asInstanceOf[js.Any], includeSharedAccounts = includeSharedAccounts.asInstanceOf[js.Any], includeStatistics = includeStatistics.asInstanceOf[js.Any], includeVersionProperties = includeVersionProperties.asInstanceOf[js.Any], includeVersions = includeVersions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], useFallbackAssetUri = useFallbackAssetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllAttributes]
  }
  @scala.inline
  implicit class AnonAllAttributesOps[Self <: AnonAllAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllAttributes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeNonValidated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNonValidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeAssetUri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAssetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeCategoryAndTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCategoryAndTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeInstallationTargets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInstallationTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLatestVersionOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLatestVersionOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLcids(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLcids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMetadata(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMinimalPayloadForVsIde(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMinimalPayloadForVsIde")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSharedAccounts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeStatistics(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeVersionProperties(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeVersionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeVersions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFallbackAssetUri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFallbackAssetUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

