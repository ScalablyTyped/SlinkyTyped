package typingsSlinky.stripe.mod.transferReversals

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReversalCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
    * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
    * be unset if you POST an empty value.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
    * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
    * the amount of the transfer reversed.
    */
  var refund_application_fee: js.UndefOr[Boolean] = js.native
}

object IReversalCreationOptions {
  @scala.inline
  def apply(): IReversalCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReversalCreationOptions]
  }
  @scala.inline
  implicit class IReversalCreationOptionsOps[Self <: IReversalCreationOptions] (val x: Self) extends AnyVal {
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
  }
  
}

