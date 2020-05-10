package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripe.BillingDetails
import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripeV3Strings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethod extends js.Object {
  /**
    * Billing information associated with the PaymentMethod that may be
    * used or required by particular types of payment methods.
    */
  var billing_details: BillingDetails = js.native
  /**
    * If this is a card PaymentMethod, this hash contains details about the card.
    */
  var card: js.UndefOr[PaymentMethodCard] = js.native
  /**
    * If this is an card_present PaymentMethod, this hash contains details
    * about the Card Present payment method.
    */
  var card_present: js.UndefOr[js.Any] = js.native
  /**
    * Time at which the object was created. Measured in seconds since the
    * Unix epoch.
    */
  var created: Double = js.native
  /**
    * The ID of the Customer to which this PaymentMethod is saved.
    * This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: String | Null = js.native
  /**
    * The unique identifier for the object
    */
  var id: String = js.native
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var metadata: Metadata = js.native
  /**
    * Value is "payment_method"
    */
  var `object`: payment_method = js.native
  /**
    * The type of the PaymentMethod. An additional hash is included on the
    * PaymentMethod with a name matching this value. It contains additional
    * information specific to the PaymentMethod type.
    */
  var `type`: String = js.native
}

object PaymentMethod {
  @scala.inline
  def apply(
    billing_details: BillingDetails,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    `object`: payment_method,
    `type`: String
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  @scala.inline
  implicit class PaymentMethodOps[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_details(value: BillingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: payment_method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: PaymentMethodCard): Self = {
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
    def withCard_present(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_present")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard_present: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_present")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(null)
        ret
    }
  }
  
}

