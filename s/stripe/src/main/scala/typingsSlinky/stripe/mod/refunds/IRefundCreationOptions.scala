package typingsSlinky.stripe.mod.refunds

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this charge to
    * refund. Can only refund up to the unrefunded amount remaining of the
    * charge.
    *
    * default is entire charge
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * String indicating the reason for the refund. If set, possible values are
    * "duplicate", "fraudulent", and "requested_by_customer". Specifying
    * "fraudulent" as the reason when you believe the charge to be fraudulent
    * will help us improve our fraud detection algorithms.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether the application fee should be refunded when
    * refunding this charge. If a full charge refund is given, the full application
    * fee will be refunded. Else, the application fee will be refunded with an
    * amount proportional to the amount of the charge refunded.
    * An application fee can only be refunded by the application that created the
    * charge.
    *
    * Connect only, default is false.
    */
  var refund_application_fee: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating whether the transfer should be reversed when
    * refunding this charge. The transfer will be reversed for the same amount
    * being refunded (either the entire or partial amount).
    * A transfer can only be reversed by the application that created the charge.
    *
    * Connect only, default is false.
    */
  var reverse_transfer: js.UndefOr[Boolean] = js.native
}

object IRefundCreationOptions {
  @scala.inline
  def apply(): IRefundCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRefundCreationOptions]
  }
  @scala.inline
  implicit class IRefundCreationOptionsOps[Self <: IRefundCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_application_fee(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_application_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_application_fee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_application_fee")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse_transfer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse_transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse_transfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse_transfer")(js.undefined)
        ret
    }
  }
  
}

