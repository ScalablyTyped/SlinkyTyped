package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.IAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressEmail extends StObject {
  
  var address: js.UndefOr[IAddress | Null] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
}
object AddressEmail {
  
  @scala.inline
  def apply(): AddressEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressEmail]
  }
  
  @scala.inline
  implicit class AddressEmailMutableBuilder[Self <: AddressEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
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
