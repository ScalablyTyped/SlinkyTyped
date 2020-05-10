package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentData extends js.Object {
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  /**
    * Capture method of this PaymentIntent, one of automatic or manual.
    */
  var capture_method: js.UndefOr[PaymentIntentDataCaptureMethodOptions] = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    * If present, the payment method used with this PaymentIntent can be attached to a Customer, even after the transaction completes.
    * Use on_session if you intend to only reuse the payment method when your customer is present in your checkout flow. Use off_session if your customer may or may not be in your checkout flow. See Saving card details after a payment to learn more.
    * Stripe uses setup_future_usage to dynamically optimize your payment flow and comply with regional legislation and network rules. For example, if your customer is impacted by SCA, using off_session will ensure that they are authenticated while processing this PaymentIntent. You will then be able to collect off-session payments for this customer.
    */
  var setup_future_usage: js.UndefOr[PaymentIntendDataFutureUsageOptions] = js.native
  /**
    * Shipping information for this payment.
    */
  var shipping: js.UndefOr[IPaymentIntentDataShipping] = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[IPaymentIntentDataTransferDataOptions] = js.native
}

object IPaymentIntentData {
  @scala.inline
  def apply(): IPaymentIntentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentData]
  }
  @scala.inline
  implicit class IPaymentIntentDataOps[Self <: IPaymentIntentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication_fee_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication_fee_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture_method(value: PaymentIntentDataCaptureMethodOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_method")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
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
    @scala.inline
    def withOn_behalf_of(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn_behalf_of: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_future_usage(value: PaymentIntendDataFutureUsageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_future_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup_future_usage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_future_usage")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: IPaymentIntentDataShipping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_data(value: IPaymentIntentDataTransferDataOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(js.undefined)
        ret
    }
  }
  
}

