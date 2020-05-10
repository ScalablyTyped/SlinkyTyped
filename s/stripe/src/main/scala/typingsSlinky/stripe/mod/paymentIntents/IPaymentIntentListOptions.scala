package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentListOptions extends IListOptionsCreated {
  /**
    * Only return PaymentIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
}

object IPaymentIntentListOptions {
  @scala.inline
  def apply(): IPaymentIntentListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentListOptions]
  }
  @scala.inline
  implicit class IPaymentIntentListOptionsOps[Self <: IPaymentIntentListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
  }
  
}

