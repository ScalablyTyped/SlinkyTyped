package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.products.IProduct
import typingsSlinky.stripe.stripeStrings.down
import typingsSlinky.stripe.stripeStrings.graduated
import typingsSlinky.stripe.stripeStrings.inf
import typingsSlinky.stripe.stripeStrings.last_during_period
import typingsSlinky.stripe.stripeStrings.last_ever
import typingsSlinky.stripe.stripeStrings.licensed
import typingsSlinky.stripe.stripeStrings.max
import typingsSlinky.stripe.stripeStrings.metered
import typingsSlinky.stripe.stripeStrings.per_unit
import typingsSlinky.stripe.stripeStrings.plan
import typingsSlinky.stripe.stripeStrings.sum
import typingsSlinky.stripe.stripeStrings.tiered
import typingsSlinky.stripe.stripeStrings.up
import typingsSlinky.stripe.stripeStrings.volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plans {
  
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
    implicit class IPlanMutableBuilder[Self <: IPlan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregate_usage(value: sum | last_during_period | last_ever | max): Self = StObject.set(x, "aggregate_usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregate_usageNull: Self = StObject.set(x, "aggregate_usage", null)
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountNull: Self = StObject.set(x, "amount", null)
      
      @scala.inline
      def setAmount_decimal(value: String): Self = StObject.set(x, "amount_decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_decimalNull: Self = StObject.set(x, "amount_decimal", null)
      
      @scala.inline
      def setBilling_scheme(value: per_unit | tiered): Self = StObject.set(x, "billing_scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: IntervalUnit): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNicknameNull: Self = StObject.set(x, "nickname", null)
      
      @scala.inline
      def setObject(value: plan): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String | IProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setTiers(value: js.Array[ITier]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiersNull: Self = StObject.set(x, "tiers", null)
      
      @scala.inline
      def setTiersVarargs(value: ITier*): Self = StObject.set(x, "tiers", js.Array(value :_*))
      
      @scala.inline
      def setTiers_mode(value: graduated | volume): Self = StObject.set(x, "tiers_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiers_modeNull: Self = StObject.set(x, "tiers_mode", null)
      
      @scala.inline
      def setTransform_usage(value: ITransformUsage): Self = StObject.set(x, "transform_usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform_usageNull: Self = StObject.set(x, "transform_usage", null)
      
      @scala.inline
      def setTrial_period_days(value: Double): Self = StObject.set(x, "trial_period_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrial_period_daysNull: Self = StObject.set(x, "trial_period_days", null)
      
      @scala.inline
      def setUsage_type(value: metered | licensed): Self = StObject.set(x, "usage_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlanCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * Whether the plan is currently available for new subscriptions. Defaults to `true`.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies a usage aggregation strategy for plans of `usage_type=metered`. Allowed values are `sum` for summing up all usage during a period, `last_during_period` for picking the last usage record reported within a period, `last_ever` for picking the last usage record ever (across period bounds) or `max` which picks the usage record with the maximum reported usage during a period. Defaults to `sum`.
      */
    var aggregate_usage: js.UndefOr[sum | last_during_period | last_ever | max] = js.native
    
    /**
      * A positive integer in cents (or 0 for a free plan) representing how much to charge on a recurring basis.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * Same as `amount`, but accepts a decimal value with at most 12 decimal places. Only one of `amount` and `amount_decimal` can be set.
      */
    var amount_decimal: js.UndefOr[Double] = js.native
    
    /**
      * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
      */
    var billing_scheme: js.UndefOr[per_unit | tiered] = js.native
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: String = js.native
    
    /**
      * An identifier randomly generated by Stripe. Used to identify this plan when subscribing a customer. You can optionally override this
      * ID, but the ID must be unique across all plans in your Stripe account. You can, however, use the same plan ID in both live and test
      * modes.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Specifies billing frequency. Either "day", "week", "month" or "year".
      */
    var interval: IntervalUnit = js.native
    
    /**
      * The number of intervals between each subscription billing. For example, interval=month and interval_count=3 bills every 3 months.
      * Maximum of one year interval allowed (1 year, 12 months, or 52 weeks).
      */
    var interval_count: js.UndefOr[Double] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    @JSName("metadata")
    var metadata_IPlanCreationOptions: js.UndefOr[IMetadata] = js.native
    
    /**
      * A brief description of the plan, hidden from customers.
      */
    var nickname: js.UndefOr[String] = js.native
    
    /**
      * The product whose pricing the created plan will represent. This can either be the ID of an existing product, or a dictionary containing
      * fields used to create a service product.
      */
    var product: String | IPlanCreationOptionsProductHash = js.native
    
    /**
      * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also the documentation for `billing_scheme`.
      */
    var tiers: js.UndefOr[js.Array[ITier]] = js.native
    
    /**
      * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity grows.
      */
    var tiers_mode: js.UndefOr[graduated | volume] = js.native
    
    /**
      * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined with `tiers`.
      */
    var transform_usage: js.UndefOr[ITransformUsage] = js.native
    
    /**
      * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
      */
    var trial_period_days: js.UndefOr[Double] = js.native
    
    /**
      * Configures how the quantity per period should be determined, can be either `metered` or `licensed`. `licensed` will automatically bill the `quantity` set for a plan when adding it to a subscription, `metered` will aggregate the total usage based on usage records. Defaults to `licensed`.
      */
    var usage_type: js.UndefOr[metered | licensed] = js.native
  }
  object IPlanCreationOptions {
    
    @scala.inline
    def apply(currency: String, interval: IntervalUnit, product: String | IPlanCreationOptionsProductHash): IPlanCreationOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlanCreationOptions]
    }
    
    @scala.inline
    implicit class IPlanCreationOptionsMutableBuilder[Self <: IPlanCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAggregate_usage(value: sum | last_during_period | last_ever | max): Self = StObject.set(x, "aggregate_usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregate_usageUndefined: Self = StObject.set(x, "aggregate_usage", js.undefined)
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setAmount_decimal(value: Double): Self = StObject.set(x, "amount_decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_decimalUndefined: Self = StObject.set(x, "amount_decimal", js.undefined)
      
      @scala.inline
      def setBilling_scheme(value: per_unit | tiered): Self = StObject.set(x, "billing_scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling_schemeUndefined: Self = StObject.set(x, "billing_scheme", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInterval(value: IntervalUnit): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval_countUndefined: Self = StObject.set(x, "interval_count", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
      
      @scala.inline
      def setProduct(value: String | IPlanCreationOptionsProductHash): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiers(value: js.Array[ITier]): Self = StObject.set(x, "tiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiersUndefined: Self = StObject.set(x, "tiers", js.undefined)
      
      @scala.inline
      def setTiersVarargs(value: ITier*): Self = StObject.set(x, "tiers", js.Array(value :_*))
      
      @scala.inline
      def setTiers_mode(value: graduated | volume): Self = StObject.set(x, "tiers_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiers_modeUndefined: Self = StObject.set(x, "tiers_mode", js.undefined)
      
      @scala.inline
      def setTransform_usage(value: ITransformUsage): Self = StObject.set(x, "transform_usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform_usageUndefined: Self = StObject.set(x, "transform_usage", js.undefined)
      
      @scala.inline
      def setTrial_period_days(value: Double): Self = StObject.set(x, "trial_period_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrial_period_daysUndefined: Self = StObject.set(x, "trial_period_days", js.undefined)
      
      @scala.inline
      def setUsage_type(value: metered | licensed): Self = StObject.set(x, "usage_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage_typeUndefined: Self = StObject.set(x, "usage_type", js.undefined)
    }
  }
  
  @js.native
  trait IPlanCreationOptionsProductHash extends StObject {
    
    /**
      * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about the object in a structured
      * format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
    
    /**
      * The product’s name, meant to be displayable to the customer.
      */
    var name: String = js.native
    
    /**
      * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description may not
      * include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically stripped. While
      * most banks display this information consistently, some may display it incorrectly or not at all.
      */
    var statement_descriptor: js.UndefOr[String] = js.native
  }
  object IPlanCreationOptionsProductHash {
    
    @scala.inline
    def apply(name: String): IPlanCreationOptionsProductHash = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlanCreationOptionsProductHash]
    }
    
    @scala.inline
    implicit class IPlanCreationOptionsProductHashMutableBuilder[Self <: IPlanCreationOptionsProductHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    }
  }
  
  @js.native
  trait IPlanUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * Whether the plan is currently available for new subscriptions.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
      */
    var nickname: js.UndefOr[String] = js.native
    
    /**
      * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
      * be affected.
      */
    var product: js.UndefOr[String] = js.native
    
    /**
      * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
      */
    var trial_period_days: js.UndefOr[Double] = js.native
  }
  object IPlanUpdateOptions {
    
    @scala.inline
    def apply(): IPlanUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlanUpdateOptions]
    }
    
    @scala.inline
    implicit class IPlanUpdateOptionsMutableBuilder[Self <: IPlanUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      @scala.inline
      def setTrial_period_days(value: Double): Self = StObject.set(x, "trial_period_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrial_period_daysUndefined: Self = StObject.set(x, "trial_period_days", js.undefined)
    }
  }
  
  @js.native
  trait ITier extends StObject {
    
    /**
      * Price for the entire tier.
      */
    var flat_amount: js.UndefOr[Double | Null] = js.native
    
    /**
      * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
      */
    var flat_amount_decimal: js.UndefOr[Double | Null] = js.native
    
    /**
      * Per unit price for units relevant to the tier.
      */
    var unit_amount: js.UndefOr[Double | Null] = js.native
    
    /**
      * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
      */
    var unit_amount_decimal: js.UndefOr[Double | Null] = js.native
    
    /**
      * Up to and including to this quantity will be contained in the tier.
      */
    var up_to: Double | Null | inf = js.native
  }
  object ITier {
    
    @scala.inline
    def apply(): ITier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITier]
    }
    
    @scala.inline
    implicit class ITierMutableBuilder[Self <: ITier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlat_amount(value: Double): Self = StObject.set(x, "flat_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlat_amountNull: Self = StObject.set(x, "flat_amount", null)
      
      @scala.inline
      def setFlat_amountUndefined: Self = StObject.set(x, "flat_amount", js.undefined)
      
      @scala.inline
      def setFlat_amount_decimal(value: Double): Self = StObject.set(x, "flat_amount_decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlat_amount_decimalNull: Self = StObject.set(x, "flat_amount_decimal", null)
      
      @scala.inline
      def setFlat_amount_decimalUndefined: Self = StObject.set(x, "flat_amount_decimal", js.undefined)
      
      @scala.inline
      def setUnit_amount(value: Double): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_amountNull: Self = StObject.set(x, "unit_amount", null)
      
      @scala.inline
      def setUnit_amountUndefined: Self = StObject.set(x, "unit_amount", js.undefined)
      
      @scala.inline
      def setUnit_amount_decimal(value: Double): Self = StObject.set(x, "unit_amount_decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_amount_decimalNull: Self = StObject.set(x, "unit_amount_decimal", null)
      
      @scala.inline
      def setUnit_amount_decimalUndefined: Self = StObject.set(x, "unit_amount_decimal", js.undefined)
      
      @scala.inline
      def setUp_to(value: Double | inf): Self = StObject.set(x, "up_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUp_toNull: Self = StObject.set(x, "up_to", null)
    }
  }
  
  @js.native
  trait ITransformUsage extends StObject {
    
    /**
      * Divide usage by this number.
      */
    var divide_by: Double = js.native
    
    /**
      * After division, either round the result `up` or `down`.
      */
    var round: up | down = js.native
  }
  object ITransformUsage {
    
    @scala.inline
    def apply(divide_by: Double, round: up | down): ITransformUsage = {
      val __obj = js.Dynamic.literal(divide_by = divide_by.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransformUsage]
    }
    
    @scala.inline
    implicit class ITransformUsageMutableBuilder[Self <: ITransformUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivide_by(value: Double): Self = StObject.set(x, "divide_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRound(value: up | down): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.day
    - typingsSlinky.stripe.stripeStrings.week
    - typingsSlinky.stripe.stripeStrings.month
    - typingsSlinky.stripe.stripeStrings.year
  */
  trait IntervalUnit extends StObject
  object IntervalUnit {
    
    @scala.inline
    def day: typingsSlinky.stripe.stripeStrings.day = "day".asInstanceOf[typingsSlinky.stripe.stripeStrings.day]
    
    @scala.inline
    def month: typingsSlinky.stripe.stripeStrings.month = "month".asInstanceOf[typingsSlinky.stripe.stripeStrings.month]
    
    @scala.inline
    def week: typingsSlinky.stripe.stripeStrings.week = "week".asInstanceOf[typingsSlinky.stripe.stripeStrings.week]
    
    @scala.inline
    def year: typingsSlinky.stripe.stripeStrings.year = "year".asInstanceOf[typingsSlinky.stripe.stripeStrings.year]
  }
}
