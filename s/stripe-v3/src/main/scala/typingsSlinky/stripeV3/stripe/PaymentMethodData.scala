package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.AnonBank
import typingsSlinky.stripeV3.AnonIban
import typingsSlinky.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodData extends js.Object {
  var billing_details: js.UndefOr[BillingDetails] = js.native
  var card: js.UndefOr[Element] = js.native
  var ideal: js.UndefOr[Element | AnonBank] = js.native
  var sepa_debit: js.UndefOr[Element | AnonIban] = js.native
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var `type`: String = js.native
}

object PaymentMethodData {
  @scala.inline
  def apply(`type`: String): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withCard(value: Element): Self = {
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
    def withIdeal(value: Element | AnonBank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
    @scala.inline
    def withSepa_debit(value: Element | AnonIban): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSepa_debit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(js.undefined)
        ret
    }
  }
  
}

