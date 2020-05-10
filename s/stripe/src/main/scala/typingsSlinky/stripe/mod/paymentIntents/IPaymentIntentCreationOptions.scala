package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.stripeStrings.automatic
import typingsSlinky.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentCreationOptions extends IPaymentIntentUpdateOptions {
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: js.UndefOr[automatic | manual] = js.native
  /**
    * Attempt to confirm this PaymentIntent immediately. If the payment method attached is a card, a return_url must be provided in case additional authentication is required.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the publishable key automatic method, or the secret key manual method
    */
  var confirmation_method: js.UndefOr[automatic | manual] = js.native
  /**
    * Set to true to indicate that the customer is not in your checkout flow during this payment attempt, and therefore is unable to authenticate. This parameter is intended for scenarios where you collect card details and charge them later.
    */
  var off_session: js.UndefOr[Boolean] = js.native
  /**
    * The Stripe account ID for which these funds are intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.native
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This param can only be used if `confirm=true`.
    */
  var return_url: js.UndefOr[String] = js.native
  /**
    * The parameters used to automatically create a Transfer when the payment succeeds.
    */
  @JSName("transfer_data")
  var transfer_data_IPaymentIntentCreationOptions: js.UndefOr[IPaymentIntentTransferData] = js.native
}

object IPaymentIntentCreationOptions {
  @scala.inline
  def apply(): IPaymentIntentCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCreationOptions]
  }
  @scala.inline
  implicit class IPaymentIntentCreationOptionsOps[Self <: IPaymentIntentCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture_method(value: automatic | manual): Self = {
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
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmation_method(value: automatic | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmation_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation_method")(js.undefined)
        ret
    }
    @scala.inline
    def withOff_session(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off_session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOff_session: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off_session")(js.undefined)
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
    def withPayment_method_options(value: IPaymentMethodOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_options")(js.undefined)
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
    def withTransfer_data(value: IPaymentIntentTransferData): Self = {
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

