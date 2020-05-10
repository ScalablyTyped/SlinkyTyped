package typingsSlinky.stripe.mod.balance

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.IListOptionsCreated
import typingsSlinky.stripe.stripeStrings.adjustment
import typingsSlinky.stripe.stripeStrings.application_fee
import typingsSlinky.stripe.stripeStrings.application_fee_refund
import typingsSlinky.stripe.stripeStrings.charge
import typingsSlinky.stripe.stripeStrings.network_cost
import typingsSlinky.stripe.stripeStrings.payment
import typingsSlinky.stripe.stripeStrings.payout
import typingsSlinky.stripe.stripeStrings.payout_failure
import typingsSlinky.stripe.stripeStrings.refund
import typingsSlinky.stripe.stripeStrings.stripe_fee
import typingsSlinky.stripe.stripeStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBalanceListOptions extends IListOptionsCreated {
  var available_on: js.UndefOr[String | IDateFilter] = js.native
  var currency: js.UndefOr[String] = js.native
  /**
    * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
    */
  var payout: js.UndefOr[String] = js.native
  /**
    * Only returns transactions that are related to the specified Stripe object ID
    * (e.g. filtering by a charge ID will return all related charge transactions).
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Only returns transactions of the given type.
    */
  var `type`: js.UndefOr[
    charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
  ] = js.native
}

object IBalanceListOptions {
  @scala.inline
  def apply(): IBalanceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalanceListOptions]
  }
  @scala.inline
  implicit class IBalanceListOptionsOps[Self <: IBalanceListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable_on(value: String | IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available_on")(js.undefined)
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
    def withPayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payout")(js.undefined)
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
    @scala.inline
    def withType(
      value: charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

