package typingsSlinky.stripe.stripeMod.balance

import typingsSlinky.stripe.stripeMod.IDateFilter
import typingsSlinky.stripe.stripeMod.IListOptionsCreated
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

trait IBalanceListOptions extends IListOptionsCreated {
  var available_on: js.UndefOr[String | IDateFilter] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  /**
    * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
    */
  var payout: js.UndefOr[String] = js.undefined
  /**
    * Only returns transactions that are related to the specified Stripe object ID
    * (e.g. filtering by a charge ID will return all related charge transactions).
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Only returns transactions of the given type.
    */
  var `type`: js.UndefOr[
    charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
  ] = js.undefined
}

object IBalanceListOptions {
  @scala.inline
  def apply(
    available_on: String | IDateFilter = null,
    created: String | IDateFilter = null,
    currency: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    payout: String = null,
    source: String = null,
    starting_after: String = null,
    `type`: charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost = null
  ): IBalanceListOptions = {
    val __obj = js.Dynamic.literal()
    if (available_on != null) __obj.updateDynamic("available_on")(available_on.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (payout != null) __obj.updateDynamic("payout")(payout.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBalanceListOptions]
  }
}

