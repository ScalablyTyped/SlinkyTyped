package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionVersion extends StObject {
  
  var assetUri: String = js.native
  
  var badges: js.Array[ExtensionBadge] = js.native
  
  var fallbackAssetUri: String = js.native
  
  var files: js.Array[ExtensionFile] = js.native
  
  var flags: ExtensionVersionFlags = js.native
  
  var lastUpdated: js.Date = js.native
  
  var properties: js.Array[KeyValue] = js.native
  
  var validationResultMessage: String = js.native
  
  var version: String = js.native
  
  var versionDescription: String = js.native
}
object ExtensionVersion {
  
  @scala.inline
  def apply(
    assetUri: String,
    badges: js.Array[ExtensionBadge],
    fallbackAssetUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionVersionFlags,
    lastUpdated: js.Date,
    properties: js.Array[KeyValue],
    validationResultMessage: String,
    version: String,
    versionDescription: String
  ): ExtensionVersion = {
    val __obj = js.Dynamic.literal(assetUri = assetUri.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], fallbackAssetUri = fallbackAssetUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], validationResultMessage = validationResultMessage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionVersion]
  }
  
  @scala.inline
  implicit class ExtensionVersionMutableBuilder[Self <: ExtensionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetUri(value: String): Self = StObject.set(x, "assetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadges(value: js.Array[ExtensionBadge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesVarargs(value: ExtensionBadge*): Self = StObject.set(x, "badges", js.Array(value :_*))
    
    @scala.inline
    def setFallbackAssetUri(value: String): Self = StObject.set(x, "fallbackAssetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Array[ExtensionFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: ExtensionFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ExtensionVersionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[KeyValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setValidationResultMessage(value: String): Self = StObject.set(x, "validationResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescription(value: String): Self = StObject.set(x, "versionDescription", value.asInstanceOf[js.Any])
  }
}
