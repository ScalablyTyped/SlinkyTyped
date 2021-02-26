package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiTeamRef extends StObject {
  
  /**
    * Team (Identity) Guid. A Team Foundation ID.
    */
  var id: String = js.native
  
  /**
    * Team name
    */
  var name: String = js.native
  
  /**
    * Team REST API Url
    */
  var url: String = js.native
}
object WebApiTeamRef {
  
  @scala.inline
  def apply(id: String, name: String, url: String): WebApiTeamRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTeamRef]
  }
  
  @scala.inline
  implicit class WebApiTeamRefMutableBuilder[Self <: WebApiTeamRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
