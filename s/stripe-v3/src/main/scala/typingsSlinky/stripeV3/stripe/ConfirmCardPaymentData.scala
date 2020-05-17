package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.anon.BillingdetailsBillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data to be sent with the request.
  * Refer to the Payment Intents API for a full list of parameters.
  */
@js.native
trait ConfirmCardPaymentData extends js.Object {
  /*
    * Either the id of an existing PaymentMethod,
    * or an object containing data to create a PaymentMethod with.
    * See the use case sections below for details.
    * Recomended
    */
  var payment_method: js.UndefOr[String | BillingdetailsBillingDetails] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * If you are handling next actions yourself,
    * pass in a return_url. If the subsequent action is redirect_to_url,
    * this URL will be used on the return path for the redirect.
    */
  var return_url: js.UndefOr[String] = js.native
  /**
    * If the PaymentIntent is associated with a customer and this parameter is set to true,
    * the provided payment method will be attached to the customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that you intend to make future payments with this PaymentIntent's payment method.
    */
  var setup_future_usage: js.UndefOr[Boolean] = js.native
  /**
    * The shipping details for the payment, if collected.
    * Recomended
    */
  var shipping: js.UndefOr[ShippingDetails] = js.native
}

object ConfirmCardPaymentData {
  @scala.inline
  def apply(): ConfirmCardPaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardPaymentData]
  }
  @scala.inline
  implicit class ConfirmCardPaymentDataOps[Self <: ConfirmCardPaymentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_method(value: String | BillingdetailsBillingDetails): Self = {
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
    def withReturn_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSave_payment_method(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave_payment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_payment_method")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup_future_usage(value: Boolean): Self = {
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
    def withShipping(value: ShippingDetails): Self = {
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
  }
  
}

