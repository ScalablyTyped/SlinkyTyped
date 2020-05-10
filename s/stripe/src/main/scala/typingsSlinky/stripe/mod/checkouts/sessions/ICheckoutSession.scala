package typingsSlinky.stripe.mod.checkouts.sessions

import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.paymentIntents.IPaymentIntent
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import typingsSlinky.stripe.stripeStrings.payment
import typingsSlinky.stripe.stripeStrings.setup
import typingsSlinky.stripe.stripeStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckoutSession extends js.Object {
  /**
    * Whether or not billing address was collected
    */
  var billing_address_collection: js.UndefOr[String] = js.native
  /**
    * URL the customer will be redirected to upon cancellation
    */
  var cancel_url: String = js.native
  /**
    * Unique reference to session
    */
  var client_reference_id: js.UndefOr[String] = js.native
  /**
    * ID of customer [Expandable]
    */
  var customer: js.UndefOr[String | ICustomer] = js.native
  /**
    * Email address of customer
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * The line items purchased
    */
  var display_items: js.Array[ICheckoutLineItems] = js.native
  /**
    * Unique ID for checkout session to pass to `redirectToCheckout` in Stripe.js
    */
  var id: String = js.native
  /**
    * If the object is in live mode or not
    */
  var livemode: Boolean = js.native
  /**
    * Language tag of the checkout session
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.native
  /**
    * String of object type. Is always 'checkout.session'
    */
  var `object`: String = js.native
  /**
    * ID of payment intent created [Expandable]
    */
  var payment_intent: js.UndefOr[String | IPaymentIntent] = js.native
  /**
    * Array of accepted payment methods
    */
  var payment_method_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the SetupIntent for Checkout Sessions in setup mode.
    */
  var setup_intent: js.UndefOr[String | Null] = js.native
  /**
    * ID of subscription if one was created [Expandable]
    */
  var subscription: js.UndefOr[String | ISubscription] = js.native
  /**
    * URL to redirect to upon success
    */
  var success_url: String = js.native
}

object ICheckoutSession {
  @scala.inline
  def apply(
    cancel_url: String,
    display_items: js.Array[ICheckoutLineItems],
    id: String,
    livemode: Boolean,
    `object`: String,
    success_url: String
  ): ICheckoutSession = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], display_items = display_items.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutSession]
  }
  @scala.inline
  implicit class ICheckoutSessionOps[Self <: ICheckoutSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_items(value: js.Array[ICheckoutLineItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_items")(value.asInstanceOf[js.Any])
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
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_address_collection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address_collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_address_collection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address_collection")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_reference_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_reference_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_reference_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: String | ICustomer): Self = {
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
    def withCustomer_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: payment | setup | subscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_intent(value: String | IPaymentIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_intent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_intent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_intentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_intent")(null)
        ret
    }
    @scala.inline
    def withSubscription(value: String | ISubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

