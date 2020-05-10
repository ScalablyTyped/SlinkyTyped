package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IInvoiceFinalizeOptionsOps[Self <: IInvoiceFinalizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_advance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_advance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

