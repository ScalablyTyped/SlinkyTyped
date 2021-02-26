package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcItemDescriptor extends StObject {
  
  var path: String = js.native
  
  var recursionLevel: VersionControlRecursionType = js.native
  
  var version: String = js.native
  
  var versionOption: TfvcVersionOption = js.native
  
  var versionType: TfvcVersionType = js.native
}
object TfvcItemDescriptor {
  
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOption: TfvcVersionOption,
    versionType: TfvcVersionType
  ): TfvcItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
  
  @scala.inline
  implicit class TfvcItemDescriptorMutableBuilder[Self <: TfvcItemDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursionLevel(value: VersionControlRecursionType): Self = StObject.set(x, "recursionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOption(value: TfvcVersionOption): Self = StObject.set(x, "versionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: TfvcVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}
