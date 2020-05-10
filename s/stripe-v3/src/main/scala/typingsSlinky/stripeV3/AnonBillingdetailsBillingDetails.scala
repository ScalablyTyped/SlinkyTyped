package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripe.BillingDetails
import typingsSlinky.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBillingdetailsBillingDetails extends js.Object {
  /**
    * The billing_details associated with the card.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  /*
    * Uses the provided card or cardNumber Element to create a
    * PaymentMethod to use for confirmation.
    */
  var card: Element | AnonToken = js.native
}

object AnonBillingdetailsBillingDetails {
  @scala.inline
  def apply(card: Element | AnonToken): AnonBillingdetailsBillingDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingdetailsBillingDetails]
  }
  @scala.inline
  implicit class AnonBillingdetailsBillingDetailsOps[Self <: AnonBillingdetailsBillingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: Element | AnonToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_details(value: BillingDetails): Self = {
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
  }
  
}

