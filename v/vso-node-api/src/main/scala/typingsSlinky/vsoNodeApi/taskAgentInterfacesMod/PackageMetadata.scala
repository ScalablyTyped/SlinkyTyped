package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageMetadata extends StObject {
  
  /**
    * The date the package was created
    */
  var createdOn: js.Date = js.native
  
  /**
    * A direct link to download the package.
    */
  var downloadUrl: String = js.native
  
  /**
    * The UI uses this to display instructions, i.e. "unzip MyAgent.zip"
    */
  var filename: String = js.native
  
  /**
    * MD5 hash as a base64 string
    */
  var hashValue: String = js.native
  
  /**
    * A link to documentation
    */
  var infoUrl: String = js.native
  
  /**
    * The platform (win7, linux, etc.)
    */
  var platform: String = js.native
  
  /**
    * The type of package (e.g. "agent")
    */
  var `type`: String = js.native
  
  /**
    * The package version.
    */
  var version: PackageVersion = js.native
}
object PackageMetadata {
  
  @scala.inline
  def apply(
    createdOn: js.Date,
    downloadUrl: String,
    filename: String,
    hashValue: String,
    infoUrl: String,
    platform: String,
    `type`: String,
    version: PackageVersion
  ): PackageMetadata = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any], infoUrl = infoUrl.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageMetadata]
  }
  
  @scala.inline
  implicit class PackageMetadataMutableBuilder[Self <: PackageMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashValue(value: String): Self = StObject.set(x, "hashValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUrl(value: String): Self = StObject.set(x, "infoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
