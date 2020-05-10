package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishedExtension extends js.Object {
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
  implicit class PublishedExtensionOps[Self <: PublishedExtension] (val x: Self) extends AnyVal {
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
    def withDeploymentType(value: ExtensionDeploymentTechnology): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: PublishedExtensionFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationTargets(value: js.Array[InstallationTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: PublisherFacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedWith(value: js.Array[ExtensionShare]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistics(value: js.Array[ExtensionStatistic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[ExtensionVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

