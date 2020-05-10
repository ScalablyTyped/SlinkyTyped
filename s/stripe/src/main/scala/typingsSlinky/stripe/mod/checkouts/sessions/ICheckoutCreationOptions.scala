package typingsSlinky.stripe.mod.checkouts.sessions

import typingsSlinky.stripe.mod.paymentIntents.IPaymentIntentData
import typingsSlinky.stripe.mod.paymentIntents.IPaymentIntentSessionSubset
import typingsSlinky.stripe.mod.setupIntents.ISetupIntentSessionSubset
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionCustCreationOptions
import typingsSlinky.stripe.stripeStrings.auto
import typingsSlinky.stripe.stripeStrings.book
import typingsSlinky.stripe.stripeStrings.da
import typingsSlinky.stripe.stripeStrings.de
import typingsSlinky.stripe.stripeStrings.donate
import typingsSlinky.stripe.stripeStrings.en
import typingsSlinky.stripe.stripeStrings.es
import typingsSlinky.stripe.stripeStrings.fi
import typingsSlinky.stripe.stripeStrings.fr
import typingsSlinky.stripe.stripeStrings.it
import typingsSlinky.stripe.stripeStrings.ja
import typingsSlinky.stripe.stripeStrings.nb
import typingsSlinky.stripe.stripeStrings.nl
import typingsSlinky.stripe.stripeStrings.pay
import typingsSlinky.stripe.stripeStrings.payment
import typingsSlinky.stripe.stripeStrings.pl
import typingsSlinky.stripe.stripeStrings.pt
import typingsSlinky.stripe.stripeStrings.required
import typingsSlinky.stripe.stripeStrings.setup
import typingsSlinky.stripe.stripeStrings.subscription
import typingsSlinky.stripe.stripeStrings.sv
import typingsSlinky.stripe.stripeStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckoutCreationOptions extends js.Object {
  /**
    * Whether to collect shipping info.
    * If 'required', info will always be collected.
    * When 'auto' or not specified, info will be collected when required
    */
  var billing_address_collection: js.UndefOr[required | auto] = js.native
  /**
    * The URL to return the customer to if they cancel payment
    */
  var cancel_url: String = js.native
  /**
    * An optional unique ID to associate with the checkout
    */
  var client_reference_id: js.UndefOr[String] = js.native
  /**
    * Must be used with @param line_items
    * ID of existing customer to use
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Email of the customer
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * A list of items the customer is purchasing. One-time.
    */
  var line_items: js.UndefOr[js.Array[ICheckoutLineItems]] = js.native
  /**
    * Language to use. If 'auto' or not specified, browser default is used
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh] = js.native
  /**
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.native
  /**
    * Details for creation of payment intent
    */
  var payment_intent_data: js.UndefOr[IPaymentIntentSessionSubset | IPaymentIntentData] = js.native
  /**
    * A list of accepted payment types.
    * 'card' is currently the only supported options
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * A subset of parameters to be passed to SetupIntent creation.
    */
  var setup_intent_data: js.UndefOr[ISetupIntentSessionSubset] = js.native
  /**
    * Describes the type of transaction being performed by Checkout in order to customize relevant text on the page, such as the submit button.
    * submit_type can only be specified on Checkout Sessions using line items or a SKU, but not Checkout Sessions for subscriptions.
    * Supported values are auto, book, donate, or pay.
    */
  var submit_type: js.UndefOr[auto | book | donate | pay] = js.native
  /**
    * Use instead of @param line_items when using a subscription
    */
  var subscription_data: js.UndefOr[ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions] = js.native
  /**
    * The url to return to upon successful payment
    */
  var success_url: String = js.native
}

object ICheckoutCreationOptions {
  @scala.inline
  def apply(cancel_url: String, payment_method_types: js.Array[String], success_url: String): ICheckoutCreationOptions = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutCreationOptions]
  }
  @scala.inline
  implicit class ICheckoutCreationOptionsOps[Self <: ICheckoutCreationOptions] (val x: Self) extends AnyVal {
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
    def withPayment_method_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_address_collection(value: required | auto): Self = {
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
    def withLine_items(value: js.Array[ICheckoutLineItems]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh): Self = {
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
    def withPayment_intent_data(value: IPaymentIntentSessionSubset | IPaymentIntentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_intent_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent_data")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_intent_data(value: ISetupIntentSessionSubset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_intent_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup_intent_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_intent_data")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit_type(value: auto | book | donate | pay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmit_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_data(value: ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_data")(js.undefined)
        ret
    }
  }
  
}

