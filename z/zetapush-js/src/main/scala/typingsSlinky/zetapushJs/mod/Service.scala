package typingsSlinky.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
  var DEFAULT_DEPLOYMENT_ID: String = js.native
}
object Service {
  
  @scala.inline
  def apply(DEFAULT_DEPLOYMENT_ID: String): Service = {
    val __obj = js.Dynamic.literal(DEFAULT_DEPLOYMENT_ID = DEFAULT_DEPLOYMENT_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT_DEPLOYMENT_ID(value: String): Self = StObject.set(x, "DEFAULT_DEPLOYMENT_ID", value.asInstanceOf[js.Any])
  }
}
