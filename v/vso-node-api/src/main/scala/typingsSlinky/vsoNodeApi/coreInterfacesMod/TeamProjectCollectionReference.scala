package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamProjectCollectionReference extends StObject {
  
  /**
    * Collection Id.
    */
  var id: String = js.native
  
  /**
    * Collection Name.
    */
  var name: String = js.native
  
  /**
    * Collection REST Url.
    */
  var url: String = js.native
}
object TeamProjectCollectionReference {
  
  @scala.inline
  def apply(id: String, name: String, url: String): TeamProjectCollectionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectCollectionReference]
  }
  
  @scala.inline
  implicit class TeamProjectCollectionReferenceMutableBuilder[Self <: TeamProjectCollectionReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
