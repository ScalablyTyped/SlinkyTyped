package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTreeEntryRef extends StObject {
  
  /**
    * Blob or tree
    */
  var gitObjectType: GitObjectType = js.native
  
  /**
    * Mode represented as octal string
    */
  var mode: String = js.native
  
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  
  /**
    * Path relative to parent tree object
    */
  var relativePath: String = js.native
  
  /**
    * Size of content
    */
  var size: Double = js.native
  
  /**
    * url to retrieve tree or blob
    */
  var url: String = js.native
}
object GitTreeEntryRef {
  
  @scala.inline
  def apply(
    gitObjectType: GitObjectType,
    mode: String,
    objectId: String,
    relativePath: String,
    size: Double,
    url: String
  ): GitTreeEntryRef = {
    val __obj = js.Dynamic.literal(gitObjectType = gitObjectType.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeEntryRef]
  }
  
  @scala.inline
  implicit class GitTreeEntryRefMutableBuilder[Self <: GitTreeEntryRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGitObjectType(value: GitObjectType): Self = StObject.set(x, "gitObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
