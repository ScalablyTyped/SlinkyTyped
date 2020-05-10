package typingsSlinky.stripe.mod.plans

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.products.IProduct
import typingsSlinky.stripe.stripeStrings.graduated
import typingsSlinky.stripe.stripeStrings.last_during_period
import typingsSlinky.stripe.stripeStrings.last_ever
import typingsSlinky.stripe.stripeStrings.licensed
import typingsSlinky.stripe.stripeStrings.max
import typingsSlinky.stripe.stripeStrings.metered
import typingsSlinky.stripe.stripeStrings.per_unit
import typingsSlinky.stripe.stripeStrings.plan
import typingsSlinky.stripe.stripeStrings.sum
import typingsSlinky.stripe.stripeStrings.tiered
import typingsSlinky.stripe.stripeStrings.volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription plan contains the pricing information for different products and feature levels on your site.
  * For example, you might have a $10/month plan for basic features and a different $20/month plan for premium features.
  */
@js.native
trait IPlan extends IResourceObject {
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: Boolean = js.native
  /**
    * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for picking the last usage record reported within a period, `last_ever` for picking the last usage record ever (across period bounds) or `max` which picks the usage record with the maximum reported usage during a period. Defaults to `sum`.
    */
  var aggregate_usage: sum | last_during_period | last_ever | max | Null = js.native
  /**
    * The amount in cents to be charged on the interval specified
    */
  var amount: Double | Null = js.native
  /**
    * Same as `amount`, but contains a decimal value with at most 12 decimal places.
    */
  var amount_decimal: String | Null = js.native
  /**
    * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
    */
  var billing_scheme: per_unit | tiered = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * One of `day`, `week`, `month` or `year`. The frequency with which a subscription should be billed.
    */
  var interval: IntervalUnit = js.native
  /**
    * The number of intervals (specified in the `interval` property) between subscription billings. For example, `interval=month` and `interval_count=3` bills every 3 months.
    */
  var interval_count: Double = js.native
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * A brief description of the plan, hidden from customers.
    */
  var nickname: String | Null = js.native
  /**
    * Value is "plan"
    */
  @JSName("object")
  var object_IPlan: plan = js.native
  /**
    * The product whose pricing this plan determines. [Expandable]
    */
  var product: js.UndefOr[String | IProduct] = js.native
  /**
    * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
    */
  var tiers: js.Array[ITier] | Null = js.native
  /**
    * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity grows.
    */
  var tiers_mode: graduated | volume | Null = js.native
  /**
    * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined with `tiers`.
    */
  var transform_usage: ITransformUsage | Null = js.native
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: Double | Null = js.native
  /**
    * Configures how the quantity per period should be determined, can be either `metered` or `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to a subscription, `metered` will aggregate the total usage based on usage records. Defaults to `licensed`.
    */
  var usage_type: metered | licensed = js.native
}

object IPlan {
  @scala.inline
  def apply(
    active: Boolean,
    billing_scheme: per_unit | tiered,
    created: Double,
    currency: String,
    id: String,
    interval: IntervalUnit,
    interval_count: Double,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: plan,
    usage_type: metered | licensed
  ): IPlan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], billing_scheme = billing_scheme.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], interval_count = interval_count.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], usage_type = usage_type.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlan]
  }
  @scala.inline
  implicit class IPlanOps[Self <: IPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_scheme(value: per_unit | tiered): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: IntervalUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: plan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage_type(value: metered | licensed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregate_usage(value: sum | last_during_period | last_ever | max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregate_usageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate_usage")(null)
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(null)
        ret
    }
    @scala.inline
    def withAmount_decimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_decimalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_decimal")(null)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNicknameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(null)
        ret
    }
    @scala.inline
    def withProduct(value: String | IProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withTiers(value: js.Array[ITier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiers")(null)
        ret
    }
    @scala.inline
    def withTiers_mode(value: graduated | volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiers_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiers_modeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiers_mode")(null)
        ret
    }
    @scala.inline
    def withTransform_usage(value: ITransformUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform_usageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_usage")(null)
        ret
    }
    @scala.inline
    def withTrial_period_days(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_period_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrial_period_daysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_period_days")(null)
        ret
    }
  }
  
}

