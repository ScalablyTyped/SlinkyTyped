package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IDataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceFinalizeOptions extends IDataOptions {
  
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: Boolean = js.native
}
object IInvoiceFinalizeOptions {
  
  @scala.inline
  def apply(auto_advance: Boolean): IInvoiceFinalizeOptions = {
    val __obj = js.Dynamic.literal(auto_advance = auto_advance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceFinalizeOptions]
  }
  
  @scala.inline
  implicit class IInvoiceFinalizeOptionsMutableBuilder[Self <: IInvoiceFinalizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
  }
}
