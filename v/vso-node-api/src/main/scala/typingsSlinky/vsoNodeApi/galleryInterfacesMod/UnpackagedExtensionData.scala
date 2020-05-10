package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnpackagedExtensionData extends js.Object {
  var categories: js.Array[String] = js.native
  var description: String = js.native
  var displayName: String = js.native
  var draftId: String = js.native
  var extensionName: String = js.native
  var installationTargets: js.Array[InstallationTarget] = js.native
  var isConvertedToMarkdown: Boolean = js.native
  var pricingCategory: String = js.native
  var product: String = js.native
  var publisherName: String = js.native
  var qnAEnabled: Boolean = js.native
  var referralUrl: String = js.native
  var repositoryUrl: String = js.native
  var tags: js.Array[String] = js.native
  var version: String = js.native
  var vsixId: String = js.native
}

object UnpackagedExtensionData {
  @scala.inline
  def apply(
    categories: js.Array[String],
    description: String,
    displayName: String,
    draftId: String,
    extensionName: String,
    installationTargets: js.Array[InstallationTarget],
    isConvertedToMarkdown: Boolean,
    pricingCategory: String,
    product: String,
    publisherName: String,
    qnAEnabled: Boolean,
    referralUrl: String,
    repositoryUrl: String,
    tags: js.Array[String],
    version: String,
    vsixId: String
  ): UnpackagedExtensionData = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], draftId = draftId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], isConvertedToMarkdown = isConvertedToMarkdown.asInstanceOf[js.Any], pricingCategory = pricingCategory.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], qnAEnabled = qnAEnabled.asInstanceOf[js.Any], referralUrl = referralUrl.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vsixId = vsixId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackagedExtensionData]
  }
  @scala.inline
  implicit class UnpackagedExtensionDataOps[Self <: UnpackagedExtensionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDraftId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargets(value: js.Array[InstallationTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConvertedToMarkdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConvertedToMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricingCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnAEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnAEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferralUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsixId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsixId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

