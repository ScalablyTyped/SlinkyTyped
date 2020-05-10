package typingsSlinky.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentConfirmOptions extends js.Object {
  /**
    * The client secret of this SetupIntent. Used for client-side confirmation using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: js.UndefOr[String] = js.native
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
  /**
    * The URL to redirect your customer back to after they authenticate on the payment method’s
    * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
    * supply an application URI scheme. This parameter is only used for cards and other
    * redirect-based payment methods.
    */
  var return_url: js.UndefOr[String] = js.native
}

object ISetupIntentConfirmOptions {
  @scala.inline
  def apply(): ISetupIntentConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentConfirmOptions]
  }
  @scala.inline
  implicit class ISetupIntentConfirmOptionsOps[Self <: ISetupIntentConfirmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method(value: String): Self = {
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
    def withPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = {
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
  }
  
}

