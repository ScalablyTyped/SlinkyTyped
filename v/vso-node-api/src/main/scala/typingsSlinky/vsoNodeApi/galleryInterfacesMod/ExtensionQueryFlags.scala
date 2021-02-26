package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFlags")
@js.native
object ExtensionQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionQueryFlags with Double] = js.native
  
  /**
    * AllAttributes is designed to be a mask that defines all sub-elements of the extension should be returned.  NOTE: This is not actually All flags. This is now locked to the set defined since changing this enum would be a breaking change and would change the behavior of anyone using it. Try not to use this value when making calls to the service, instead be explicit about the options required.
    */
  @js.native
  sealed trait AllAttributes extends ExtensionQueryFlags
  /* 479 */ val AllAttributes: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.AllAttributes with Double = js.native
  
  /**
    * Excluding non-validated extensions will remove any extension versions that either are in the process of being validated or have failed validation.
    */
  @js.native
  sealed trait ExcludeNonValidated extends ExtensionQueryFlags
  /* 32 */ val ExcludeNonValidated: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.ExcludeNonValidated with Double = js.native
  
  /**
    * Include the base uri for assets of this extension
    */
  @js.native
  sealed trait IncludeAssetUri extends ExtensionQueryFlags
  /* 128 */ val IncludeAssetUri: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeAssetUri with Double = js.native
  
  /**
    * Include the Categories and Tags that were added to the extension definition.
    */
  @js.native
  sealed trait IncludeCategoryAndTags extends ExtensionQueryFlags
  /* 4 */ val IncludeCategoryAndTags: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeCategoryAndTags with Double = js.native
  
  /**
    * IncludeFiles will return information about which files were found within the extension that were stored independant of the manifest. When asking for files, versions will be included as well since files are returned as a property of the versions.  These files can be retrieved using the path to the file without requiring the entire manifest be downloaded.
    */
  @js.native
  sealed trait IncludeFiles extends ExtensionQueryFlags
  /* 2 */ val IncludeFiles: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeFiles with Double = js.native
  
  /**
    * Include the set of installation targets the extension has requested.
    */
  @js.native
  sealed trait IncludeInstallationTargets extends ExtensionQueryFlags
  /* 64 */ val IncludeInstallationTargets: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeInstallationTargets with Double = js.native
  
  /**
    * When retrieving versions from a query, only include the latest version of the extensions that matched. This is useful when the caller doesn't need all the published versions. It will save a significant size in the returned payload.
    */
  @js.native
  sealed trait IncludeLatestVersionOnly extends ExtensionQueryFlags
  /* 512 */ val IncludeLatestVersionOnly: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeLatestVersionOnly with Double = js.native
  
  /**
    * This flag is used to get Lcid values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal
    */
  @js.native
  sealed trait IncludeLcids extends ExtensionQueryFlags
  /* 8192 */ val IncludeLcids: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeLcids with Double = js.native
  
  /**
    * This flag is used to get all the metadata values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal.
    */
  @js.native
  sealed trait IncludeMetadata extends ExtensionQueryFlags
  /* 2048 */ val IncludeMetadata: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeMetadata with Double = js.native
  
  /**
    * This flag is used to indicate to return very small data for extension reruired by VS IDE. This flag is only compatible when querying is done by VS IDE
    */
  @js.native
  sealed trait IncludeMinimalPayloadForVsIde extends ExtensionQueryFlags
  /* 4096 */ val IncludeMinimalPayloadForVsIde: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeMinimalPayloadForVsIde with Double = js.native
  
  /**
    * Include the details about which accounts the extension has been shared with if the extesion is a private extension.
    */
  @js.native
  sealed trait IncludeSharedAccounts extends ExtensionQueryFlags
  /* 8 */ val IncludeSharedAccounts: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeSharedAccounts with Double = js.native
  
  /**
    * Include the statistics associated with this extension
    */
  @js.native
  sealed trait IncludeStatistics extends ExtensionQueryFlags
  /* 256 */ val IncludeStatistics: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeStatistics with Double = js.native
  
  /**
    * Include properties associated with versions of the extension
    */
  @js.native
  sealed trait IncludeVersionProperties extends ExtensionQueryFlags
  /* 16 */ val IncludeVersionProperties: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeVersionProperties with Double = js.native
  
  /**
    * IncludeVersions will return version information for extensions returned
    */
  @js.native
  sealed trait IncludeVersions extends ExtensionQueryFlags
  /* 1 */ val IncludeVersions: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.IncludeVersions with Double = js.native
  
  /**
    * None is used to retrieve only the basic extension details.
    */
  @js.native
  sealed trait None extends ExtensionQueryFlags
  /* 0 */ val None: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.None with Double = js.native
  
  /**
    * This flag switches the asset uri to use GetAssetByName instead of CDN When this is used, values of base asset uri and base asset uri fallback are switched When this is used, source of asset files are pointed to Gallery service always even if CDN is available
    */
  @js.native
  sealed trait UseFallbackAssetUri extends ExtensionQueryFlags
  /* 1024 */ val UseFallbackAssetUri: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFlags.UseFallbackAssetUri with Double = js.native
}
