package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitBaseVersionDescriptor extends GitVersionDescriptor {
  
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var baseVersion: String = js.native
  
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var baseVersionOptions: GitVersionOptions = js.native
  
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var baseVersionType: GitVersionType = js.native
}
object GitBaseVersionDescriptor {
  
  @scala.inline
  def apply(
    baseVersion: String,
    baseVersionOptions: GitVersionOptions,
    baseVersionType: GitVersionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitBaseVersionDescriptor = {
    val __obj = js.Dynamic.literal(baseVersion = baseVersion.asInstanceOf[js.Any], baseVersionOptions = baseVersionOptions.asInstanceOf[js.Any], baseVersionType = baseVersionType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitBaseVersionDescriptor]
  }
  
  @scala.inline
  implicit class GitBaseVersionDescriptorMutableBuilder[Self <: GitBaseVersionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseVersion(value: String): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "baseVersionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVersionType(value: GitVersionType): Self = StObject.set(x, "baseVersionType", value.asInstanceOf[js.Any])
  }
}
