package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishedExtension extends StObject {
  
  var categories: js.Array[String] = js.native
  
  var deploymentType: ExtensionDeploymentTechnology = js.native
  
  var displayName: String = js.native
  
  var extensionId: String = js.native
  
  var extensionName: String = js.native
  
  var flags: PublishedExtensionFlags = js.native
  
  var installationTargets: js.Array[InstallationTarget] = js.native
  
  var lastUpdated: js.Date = js.native
  
  var longDescription: String = js.native
  
  /**
    * Date on which the extension was first uploaded.
    */
  var publishedDate: js.Date = js.native
  
  var publisher: PublisherFacts = js.native
  
  /**
    * Date on which the extension first went public.
    */
  var releaseDate: js.Date = js.native
  
  var sharedWith: js.Array[ExtensionShare] = js.native
  
  var shortDescription: String = js.native
  
  var statistics: js.Array[ExtensionStatistic] = js.native
  
  var tags: js.Array[String] = js.native
  
  var versions: js.Array[ExtensionVersion] = js.native
}
object PublishedExtension {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    deploymentType: ExtensionDeploymentTechnology,
    displayName: String,
    extensionId: String,
    extensionName: String,
    flags: PublishedExtensionFlags,
    installationTargets: js.Array[InstallationTarget],
    lastUpdated: js.Date,
    longDescription: String,
    publishedDate: js.Date,
    publisher: PublisherFacts,
    releaseDate: js.Date,
    sharedWith: js.Array[ExtensionShare],
    shortDescription: String,
    statistics: js.Array[ExtensionStatistic],
    tags: js.Array[String],
    versions: js.Array[ExtensionVersion]
  ): PublishedExtension = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], deploymentType = deploymentType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sharedWith = sharedWith.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedExtension]
  }
  
  @scala.inline
  implicit class PublishedExtensionMutableBuilder[Self <: PublishedExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentType(value: ExtensionDeploymentTechnology): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: PublishedExtensionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargets(value: js.Array[InstallationTarget]): Self = StObject.set(x, "installationTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargetsVarargs(value: InstallationTarget*): Self = StObject.set(x, "installationTargets", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: PublisherFacts): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: js.Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWith(value: js.Array[ExtensionShare]): Self = StObject.set(x, "sharedWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithVarargs(value: ExtensionShare*): Self = StObject.set(x, "sharedWith", js.Array(value :_*))
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistics(value: js.Array[ExtensionStatistic]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: ExtensionStatistic*): Self = StObject.set(x, "statistics", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[ExtensionVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: ExtensionVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
