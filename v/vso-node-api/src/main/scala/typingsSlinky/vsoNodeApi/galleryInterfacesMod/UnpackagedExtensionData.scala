package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnpackagedExtensionData extends StObject {
  
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
  implicit class UnpackagedExtensionDataMutableBuilder[Self <: UnpackagedExtensionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftId(value: String): Self = StObject.set(x, "draftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargets(value: js.Array[InstallationTarget]): Self = StObject.set(x, "installationTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargetsVarargs(value: InstallationTarget*): Self = StObject.set(x, "installationTargets", js.Array(value :_*))
    
    @scala.inline
    def setIsConvertedToMarkdown(value: Boolean): Self = StObject.set(x, "isConvertedToMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingCategory(value: String): Self = StObject.set(x, "pricingCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQnAEnabled(value: Boolean): Self = StObject.set(x, "qnAEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralUrl(value: String): Self = StObject.set(x, "referralUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsixId(value: String): Self = StObject.set(x, "vsixId", value.asInstanceOf[js.Any])
  }
}
