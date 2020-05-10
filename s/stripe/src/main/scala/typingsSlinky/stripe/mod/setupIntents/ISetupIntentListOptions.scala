package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentListOptions extends IListOptionsCreated {
  /**
    * Only return SetupIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Only return SetupIntents associated with the specified payment method.
    */
  var payment_method: js.UndefOr[String] = js.native
}

object ISetupIntentListOptions {
  @scala.inline
  def apply(): ISetupIntentListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentListOptions]
  }
  @scala.inline
  implicit class ISetupIntentListOptionsOps[Self <: ISetupIntentListOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
        ret
    }
  }
  
}

