package typingsSlinky.stripe.mod.coupons

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.forever
import typingsSlinky.stripe.stripeStrings.once
import typingsSlinky.stripe.stripeStrings.repeating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICouponCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer representing the amount to subtract from an invoice total (required if percent_off is not passed)
    */
  var amount_off: js.UndefOr[Double] = js.native
  /**
    * Currency of the amount_off parameter (required if amount_off is passed)
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Specifies how long the discount will be in effect. Can be forever, once, or repeating.
    */
  var duration: forever | once | repeating = js.native
  /**
    * Required only if duration is repeating, in which case it must be a positive integer that specifies the number of months
    * the discount will be in effect.
    */
  var duration_in_months: js.UndefOr[Double] = js.native
  /**
    * Unique string of your choice that will be used to identify this coupon when applying it to a customer. This is often a specific
    * code you’ll give to your customer to use when signing up (e.g. FALL25OFF). If you don’t want to specify a particular code, you
    * can leave the ID blank and we’ll generate a random code for you.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A positive integer specifying the number of times the coupon can be redeemed before it’s no longer valid.
    *
    * For example, you might have a 50% off coupon that the first 20 readers of your blog can use.
    */
  var max_redemptions: js.UndefOr[Double] = js.native
  /**
    * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default the id is shown if name is not set.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A positive integer between 1 and 100 that represents the discount the coupon will apply (required if amount_off is not passed)
    */
  var percent_off: js.UndefOr[Double] = js.native
  /**
    * Unix timestamp specifying the last time at which the coupon can be redeemed.
    * After the redeem_by date, the coupon can no longer be applied to new customers.
    */
  var redeem_by: js.UndefOr[Double] = js.native
}

object ICouponCreationOptions {
  @scala.inline
  def apply(duration: forever | once | repeating): ICouponCreationOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICouponCreationOptions]
  }
  @scala.inline
  implicit class ICouponCreationOptionsOps[Self <: ICouponCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: forever | once | repeating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_off(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount_off: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_off")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration_in_months(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration_in_months: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_months")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_redemptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_redemptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_redemptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_redemptions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent_off(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent_off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent_off: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent_off")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeem_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeem_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeem_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeem_by")(js.undefined)
        ret
    }
  }
  
}

