package typingsSlinky.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnerInfo extends StObject {
  
  var address: js.UndefOr[OwnerAddress] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
}
object OwnerInfo {
  
  @scala.inline
  def apply(): OwnerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerInfo]
  }
  
  @scala.inline
  implicit class OwnerInfoMutableBuilder[Self <: OwnerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: OwnerAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
