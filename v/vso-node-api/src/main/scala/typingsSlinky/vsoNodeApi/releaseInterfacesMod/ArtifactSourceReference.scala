package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSourceReference extends StObject {
  
  var id: String = js.native
  
  var name: String = js.native
}
object ArtifactSourceReference {
  
  @scala.inline
  def apply(id: String, name: String): ArtifactSourceReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceReference]
  }
  
  @scala.inline
  implicit class ArtifactSourceReferenceMutableBuilder[Self <: ArtifactSourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
