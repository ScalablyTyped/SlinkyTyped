package typingsSlinky.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalletData extends StObject {
  
  /**
    * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var billing_address: WalletAddress = js.native
  
  /**
    * Owner's verified email. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var email: String = js.native
  
  /**
    * Owner's verified full name. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var name: String = js.native
  
  /**
    * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the time of authorization or settlement. They cannot be set or mutated.
    */
  var shipping_address: WalletAddress = js.native
}
object WalletData {
  
  @scala.inline
  def apply(billing_address: WalletAddress, email: String, name: String, shipping_address: WalletAddress): WalletData = {
    val __obj = js.Dynamic.literal(billing_address = billing_address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletData]
  }
  
  @scala.inline
  implicit class WalletDataMutableBuilder[Self <: WalletData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_address(value: WalletAddress): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_address(value: WalletAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
  }
}
