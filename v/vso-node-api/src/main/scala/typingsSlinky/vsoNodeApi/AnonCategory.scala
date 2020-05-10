package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategory extends js.Object {
  var category: Double = js.native
  var contributionType: Double = js.native
  var displayName: Double = js.native
  var excludeWithFlags: Double = js.native
  var featured: Double = js.native
  var featuredInCategory: Double = js.native
  var id: Double = js.native
  var includeWithFlags: Double = js.native
  var installationTarget: Double = js.native
  var installationTargetVersion: Double = js.native
  var installationTargetVersionRange: Double = js.native
  var lcid: Double = js.native
  var name: Double = js.native
  var `private`: Double = js.native
  var searchText: Double = js.native
  var tag: Double = js.native
  var vsixMetadata: Double = js.native
}

object AnonCategory {
  @scala.inline
  def apply(
    category: Double,
    contributionType: Double,
    displayName: Double,
    excludeWithFlags: Double,
    featured: Double,
    featuredInCategory: Double,
    id: Double,
    includeWithFlags: Double,
    installationTarget: Double,
    installationTargetVersion: Double,
    installationTargetVersionRange: Double,
    lcid: Double,
    name: Double,
    `private`: Double,
    searchText: Double,
    tag: Double,
    vsixMetadata: Double
  ): AnonCategory = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], contributionType = contributionType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], excludeWithFlags = excludeWithFlags.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], featuredInCategory = featuredInCategory.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includeWithFlags = includeWithFlags.asInstanceOf[js.Any], installationTarget = installationTarget.asInstanceOf[js.Any], installationTargetVersion = installationTargetVersion.asInstanceOf[js.Any], installationTargetVersionRange = installationTargetVersionRange.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], vsixMetadata = vsixMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
  @scala.inline
  implicit class AnonCategoryOps[Self <: AnonCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludeWithFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeWithFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeaturedInCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredInCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeWithFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWithFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargetVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargetVersionRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargetVersionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsixMetadata(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsixMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

