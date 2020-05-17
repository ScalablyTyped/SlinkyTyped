package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.anon.Address
import typingsSlinky.stripe.anon.Cvc
import typingsSlinky.stripe.anon.Token
import typingsSlinky.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentMethodCreationOptions extends js.Object {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Address] = js.native
  /**
    * If this is a card PaymentMethod, this hash contains the user’s card details. For backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
    * Amex Express Checkout, or legacy Checkout) into the card hash with format card: {token: "tok_visa"}. When creating with a card number, you must meet the requirements for
    * PCI compliance. We strongly recommend using Stripe.js instead of interacting with this API directly.
    */
  var card: js.UndefOr[Cvc | Token] = js.native
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * The type of the PaymentMethod, one of: card and card_present. An additional hash is included on the PaymentMethod with a name matching this value.
    * It contains additional information specific to the PaymentMethod type.
    */
  var `type`: IPaymentMethodType = js.native
}

object IPaymentMethodCreationOptions {
  @scala.inline
  def apply(`type`: IPaymentMethodType): IPaymentMethodCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodCreationOptions]
  }
  @scala.inline
  implicit class IPaymentMethodCreationOptionsOps[Self <: IPaymentMethodCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: IPaymentMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCard(value: Cvc | Token): Self = {
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

