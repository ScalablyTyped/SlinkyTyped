package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  var category: scala.Double = js.native
  var contributionType: scala.Double = js.native
  var displayName: scala.Double = js.native
  var excludeWithFlags: scala.Double = js.native
  var featured: scala.Double = js.native
  var featuredInCategory: scala.Double = js.native
  var id: scala.Double = js.native
  var includeWithFlags: scala.Double = js.native
  var installationTarget: scala.Double = js.native
  var installationTargetVersion: scala.Double = js.native
  var installationTargetVersionRange: scala.Double = js.native
  var lcid: scala.Double = js.native
  var name: scala.Double = js.native
  var `private`: scala.Double = js.native
  var searchText: scala.Double = js.native
  var tag: scala.Double = js.native
  var vsixMetadata: scala.Double = js.native
}

object Category {
  @scala.inline
  def apply(
    category: scala.Double,
    contributionType: scala.Double,
    displayName: scala.Double,
    excludeWithFlags: scala.Double,
    featured: scala.Double,
    featuredInCategory: scala.Double,
    id: scala.Double,
    includeWithFlags: scala.Double,
    installationTarget: scala.Double,
    installationTargetVersion: scala.Double,
    installationTargetVersionRange: scala.Double,
    lcid: scala.Double,
    name: scala.Double,
    `private`: scala.Double,
    searchText: scala.Double,
    tag: scala.Double,
    vsixMetadata: scala.Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], contributionType = contributionType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], excludeWithFlags = excludeWithFlags.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], featuredInCategory = featuredInCategory.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeWithFlags = includeWithFlags.asInstanceOf[js.Any], installationTarget = installationTarget.asInstanceOf[js.Any], installationTargetVersion = installationTargetVersion.asInstanceOf[js.Any], installationTargetVersionRange = installationTargetVersionRange.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vsixMetadata = vsixMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionType(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeWithFlags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeWithFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturedInCategory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredInCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeWithFlags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWithFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTarget(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargetVersion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargetVersionRange(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargetVersionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchText(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsixMetadata(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsixMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

