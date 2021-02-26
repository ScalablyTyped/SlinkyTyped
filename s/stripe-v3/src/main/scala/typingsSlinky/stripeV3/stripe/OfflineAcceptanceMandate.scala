package typingsSlinky.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAcceptanceMandate extends StObject {
  
  var contact_email: String = js.native
}
object OfflineAcceptanceMandate {
  
  @scala.inline
  def apply(contact_email: String): OfflineAcceptanceMandate = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAcceptanceMandate]
  }
  
  @scala.inline
  implicit class OfflineAcceptanceMandateMutableBuilder[Self <: OfflineAcceptanceMandate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact_email(value: String): Self = StObject.set(x, "contact_email", value.asInstanceOf[js.Any])
  }
}
