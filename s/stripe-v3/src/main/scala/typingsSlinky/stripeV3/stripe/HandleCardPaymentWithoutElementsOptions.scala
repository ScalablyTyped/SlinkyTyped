package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.AnonBillingdetailsCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleCardPaymentWithoutElementsOptions extends HandleCardPaymentOptions {
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  @JSName("payment_method_data")
  var payment_method_data_HandleCardPaymentWithoutElementsOptions: js.UndefOr[AnonBillingdetailsCard] = js.native
  /**
    * Instead of payment_method, the ID of a Source may be passed in.
    * (Note that this is undocumented as of August 2019).
    */
  var source: js.UndefOr[String] = js.native
}

object HandleCardPaymentWithoutElementsOptions {
  @scala.inline
  def apply(): HandleCardPaymentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardPaymentWithoutElementsOptions]
  }
  @scala.inline
  implicit class HandleCardPaymentWithoutElementsOptionsOps[Self <: HandleCardPaymentWithoutElementsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPayment_method_data(value: AnonBillingdetailsCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_data")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

