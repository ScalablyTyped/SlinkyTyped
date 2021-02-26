package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.anon.Object
import typingsSlinky.stripe.mod.IListOptionsCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChargeListOptions extends IListOptionsCreated {
  
  /**
    * Only return charges for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * A filter on the list based on the source of the charge. The value can be a
    * dictionary with the following options:
    */
  var source: js.UndefOr[Object] = js.native
}
object IChargeListOptions {
  
  @scala.inline
  def apply(): IChargeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeListOptions]
  }
  
  @scala.inline
  implicit class IChargeListOptionsMutableBuilder[Self <: IChargeListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setSource(value: Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
