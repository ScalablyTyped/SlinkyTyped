package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllAttributes extends js.Object {
  var allAttributes: scala.Double = js.native
  var excludeNonValidated: scala.Double = js.native
  var includeAssetUri: scala.Double = js.native
  var includeCategoryAndTags: scala.Double = js.native
  var includeFiles: scala.Double = js.native
  var includeInstallationTargets: scala.Double = js.native
  var includeLatestVersionOnly: scala.Double = js.native
  var includeLcids: scala.Double = js.native
  var includeMetadata: scala.Double = js.native
  var includeMinimalPayloadForVsIde: scala.Double = js.native
  var includeSharedAccounts: scala.Double = js.native
  var includeStatistics: scala.Double = js.native
  var includeVersionProperties: scala.Double = js.native
  var includeVersions: scala.Double = js.native
  var none: scala.Double = js.native
  var useFallbackAssetUri: scala.Double = js.native
}

object AllAttributes {
  @scala.inline
  def apply(
    allAttributes: scala.Double,
    excludeNonValidated: scala.Double,
    includeAssetUri: scala.Double,
    includeCategoryAndTags: scala.Double,
    includeFiles: scala.Double,
    includeInstallationTargets: scala.Double,
    includeLatestVersionOnly: scala.Double,
    includeLcids: scala.Double,
    includeMetadata: scala.Double,
    includeMinimalPayloadForVsIde: scala.Double,
    includeSharedAccounts: scala.Double,
    includeStatistics: scala.Double,
    includeVersionProperties: scala.Double,
    includeVersions: scala.Double,
    none: scala.Double,
    useFallbackAssetUri: scala.Double
  ): AllAttributes = {
    val __obj = js.Dynamic.literal(allAttributes = allAttributes.asInstanceOf[js.Any], excludeNonValidated = excludeNonValidated.asInstanceOf[js.Any], includeAssetUri = includeAssetUri.asInstanceOf[js.Any], includeCategoryAndTags = includeCategoryAndTags.asInstanceOf[js.Any], includeFiles = includeFiles.asInstanceOf[js.Any], includeInstallationTargets = includeInstallationTargets.asInstanceOf[js.Any], includeLatestVersionOnly = includeLatestVersionOnly.asInstanceOf[js.Any], includeLcids = includeLcids.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any], includeMinimalPayloadForVsIde = includeMinimalPayloadForVsIde.asInstanceOf[js.Any], includeSharedAccounts = includeSharedAccounts.asInstanceOf[js.Any], includeStatistics = includeStatistics.asInstanceOf[js.Any], includeVersionProperties = includeVersionProperties.asInstanceOf[js.Any], includeVersions = includeVersions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], useFallbackAssetUri = useFallbackAssetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllAttributes]
  }
  @scala.inline
  implicit class AllAttributesOps[Self <: AllAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllAttributes(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeNonValidated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNonValidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeAssetUri(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAssetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeCategoryAndTags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCategoryAndTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeFiles(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeInstallationTargets(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInstallationTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLatestVersionOnly(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLatestVersionOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLcids(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLcids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMetadata(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeMinimalPayloadForVsIde(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMinimalPayloadForVsIde")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSharedAccounts(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeStatistics(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeVersionProperties(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeVersionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeVersions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFallbackAssetUri(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFallbackAssetUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

