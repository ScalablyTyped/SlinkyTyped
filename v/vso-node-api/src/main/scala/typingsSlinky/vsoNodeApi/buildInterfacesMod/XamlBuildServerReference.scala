package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XamlBuildServerReference extends StObject {
  
  /**
    * Id of the resource
    */
  var id: Double = js.native
  
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String = js.native
  
  /**
    * Full http link to the resource
    */
  var url: String = js.native
}
object XamlBuildServerReference {
  
  @scala.inline
  def apply(id: Double, name: String, url: String): XamlBuildServerReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[XamlBuildServerReference]
  }
  
  @scala.inline
  implicit class XamlBuildServerReferenceMutableBuilder[Self <: XamlBuildServerReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
