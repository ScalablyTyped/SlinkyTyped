package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.anon.Address
import typingsSlinky.stripe.anon.Expmonth
import typingsSlinky.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentMethodUpdateOptions extends js.Object {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Address] = js.native
  var card: js.UndefOr[Expmonth] = js.native
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.native
}

object IPaymentMethodUpdateOptions {
  @scala.inline
  def apply(): IPaymentMethodUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodUpdateOptions]
  }
  @scala.inline
  implicit class IPaymentMethodUpdateOptionsOps[Self <: IPaymentMethodUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_details(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(js.undefined)
        ret
    }
    @scala.inline
    def withCard(value: Expmonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

