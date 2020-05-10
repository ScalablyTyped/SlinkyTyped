package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledExtension extends ExtensionManifest {
  /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
  var extensionId: String = js.native
  /**
    * The display name of the extension.
    */
  var extensionName: String = js.native
  /**
    * This is the set of files available from the extension.
    */
  var files: js.Array[ExtensionFile] = js.native
  /**
    * Extension flags relevant to contribution consumers
    */
  var flags: ExtensionFlags = js.native
  /**
    * Information about this particular installation of the extension
    */
  var installState: InstalledExtensionState = js.native
  /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
  var lastPublished: js.Date = js.native
  /**
    * Unique id of the publisher of this extension
    */
  var publisherId: String = js.native
  /**
    * The display name of the publisher
    */
  var publisherName: String = js.native
  /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
  var registrationId: String = js.native
  /**
    * Version of this extension
    */
  var version: String = js.native
}

object InstalledExtension {
  @scala.inline
  def apply(
    baseUri: String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[String],
    eventCallbacks: ExtensionEventCallbackCollection,
    extensionId: String,
    extensionName: String,
    fallbackBaseUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionFlags,
    installState: InstalledExtensionState,
    language: String,
    lastPublished: js.Date,
    licensing: ExtensionLicensing,
    manifestVersion: Double,
    publisherId: String,
    publisherName: String,
    registrationId: String,
    restrictedTo: js.Array[String],
    scopes: js.Array[String],
    serviceInstanceType: String,
    version: String
  ): InstalledExtension = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], contributionTypes = contributionTypes.asInstanceOf[js.Any], contributions = contributions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], eventCallbacks = eventCallbacks.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], fallbackBaseUri = fallbackBaseUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installState = installState.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], licensing = licensing.asInstanceOf[js.Any], manifestVersion = manifestVersion.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtension]
  }
  @scala.inline
  implicit class InstalledExtensionOps[Self <: InstalledExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFiles(value: js.Array[ExtensionFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: ExtensionFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallState(value: InstalledExtensionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPublished(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

