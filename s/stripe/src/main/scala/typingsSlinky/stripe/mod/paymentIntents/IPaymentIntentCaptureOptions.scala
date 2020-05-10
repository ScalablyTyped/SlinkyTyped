package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.setupIntents.ISetupIntentTransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntentCaptureOptions extends js.Object {
  /**
    * The amount to capture (in cents) from the PaymentIntent, which must be less than or equal to the original amount. Any additional amount will be automatically refunded. Defaults to the full `amount_capturable` if not provided.
    */
  var amount_to_capture: js.UndefOr[Double] = js.native
  /**
    * The amount of the application fee (if any) that will be applied to the payment and transferred to the application owner’s Stripe account. To use an application fee, the request must be made on behalf of another account, using the `Stripe-Account` header or an OAuth key.
    */
  var application_fee_amount: js.UndefOr[Double] = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. Used with connected accounts.
    */
  var on_behalf_of: js.UndefOr[String] = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized. Used with connected accounts.
    */
  var transfer_data: js.UndefOr[ISetupIntentTransferData] = js.native
}

object IPaymentIntentCaptureOptions {
  @scala.inline
  def apply(): IPaymentIntentCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentCaptureOptions]
  }
  @scala.inline
  implicit class IPaymentIntentCaptureOptionsOps[Self <: IPaymentIntentCaptureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount_to_capture(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_to_capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount_to_capture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_to_capture")(js.undefined)
        ret
    }
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
    def withTransfer_data(value: ISetupIntentTransferData): Self = {
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

