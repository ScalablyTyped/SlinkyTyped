package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSepadebit extends js.Object {
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: AnonEmail = js.native
  /**
    * An iban Element.
    */
  var sepa_debit: Element | AnonIban = js.native
}

object AnonSepadebit {
  @scala.inline
  def apply(billing_details: AnonEmail, sepa_debit: Element | AnonIban): AnonSepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSepadebit]
  }
  @scala.inline
  implicit class AnonSepadebitOps[Self <: AnonSepadebit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_details(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepa_debit(value: Element | AnonIban): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

