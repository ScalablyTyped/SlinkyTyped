package typingsSlinky.zchatBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisitorInfo extends StObject {
  
  var display_name: String = js.native
  
  var email: String = js.native
  
  var phone: String = js.native
}
object VisitorInfo {
  
  @scala.inline
  def apply(display_name: String, email: String, phone: String): VisitorInfo = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorInfo]
  }
  
  @scala.inline
  implicit class VisitorInfoMutableBuilder[Self <: VisitorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
  }
}
