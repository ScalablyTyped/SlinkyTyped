package typingsSlinky.shopifyPrime.discountMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.applies_to_resource
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.custom_collection
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.percentage
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discount extends ShopifyObject {
  /**
    * When a discount applies to a product or collection resource, applies_once determines whether the discount should
    * be applied once per order, or to every applicable item in the cart.
    */
  var applies_once: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the discount should be applied once, or any number of times per customer.
    */
  var applies_once_per_customer: js.UndefOr[Boolean] = js.native
  /**
    * The id of a collection or product that this discount code is restricted to. Leave blank for a store-wide discount.
    * If applies_to_id is set, then the applies_to_resource property is also mandatory.
    */
  var applies_to_id: js.UndefOr[Double] = js.native
  /**
    * The discount code can be set to apply to only a product, smart_collection, customersavedsearch or custom_collection.
    * If applies_to_resource is set, then applies_to_id should also be set.
    */
  var applies_to_resource: js.UndefOr[
    typingsSlinky.shopifyPrime.shopifyPrimeStrings.applies_to_resource | custom_collection | String
  ] = js.native
  /**
    * The case-insensitive discount code that customers use at checkout. Required when creating a discount.
    * Maximum length of 255 characters.
    */
  var code: String = js.native
  /**
    * Specify how the discount's value will be applied to the order. Valid values are:
    *
    * fixed_amount: The value as a unit of the store's currency will be discounted. E.g. If value is 30 and store's
    * currency is USD, then $30 is deducted.
    *
    * percentage: The percent amount to discount the order, e.g. 15% off.
    *
    * shipping: Applies a free shipping discount on orders that have a shipping rate less than or equal to the amount
    * specified in the value property. For example, free shipping for any shipping rate that is less than or equal to $70.
    */
  var discount_type: fixed_amount | percentage | shipping | String = js.native
  /**
    * The date when the discount code becomes disabled in ISO 8601 format.
    */
  var ends_at: js.UndefOr[String] = js.native
  /**
    * The minimum value an order must reach for the discount to be allowed during checkout.
    */
  var minimum_order_amount: js.UndefOr[String] = js.native
  /**
    * The date the discount becomes valid for use during checkout in ISO 8601 format.
    */
  var starts_at: js.UndefOr[String] = js.native
  /**
    * The status of the discount code. Valid values are enabled, disabled, or depleted.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Returns a count of successful checkouts where the discount code has been used. Cannot exceed the usage_limit property.
    */
  var times_used: js.UndefOr[Double] = js.native
  /**
    * The number of times this discount code can be redeemed. It can be redeemed by one or many customers; the usage_limit is a
    * store-wide absolute value. Leave blank for unlimited uses.
    */
  var usage_limit: js.UndefOr[Double] = js.native
  /**
    * The value of the discount. Required when creating a percentage-based or fixed-amount discount. See the discount_type
    * property to learn more about how value is interpreted.
    */
  var value: js.UndefOr[String] = js.native
}

object Discount {
  @scala.inline
  def apply(code: String, discount_type: fixed_amount | percentage | shipping | String): Discount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], discount_type = discount_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  @scala.inline
  implicit class DiscountOps[Self <: Discount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscount_type(value: fixed_amount | percentage | shipping | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplies_once(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies_once: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_once")(js.undefined)
        ret
    }
    @scala.inline
    def withApplies_once_per_customer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_once_per_customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies_once_per_customer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_once_per_customer")(js.undefined)
        ret
    }
    @scala.inline
    def withApplies_to_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_to_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies_to_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_to_id")(js.undefined)
        ret
    }
    @scala.inline
    def withApplies_to_resource(value: applies_to_resource | custom_collection | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_to_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies_to_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies_to_resource")(js.undefined)
        ret
    }
    @scala.inline
    def withEnds_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ends_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnds_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ends_at")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum_order_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_order_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum_order_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_order_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withStarts_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarts_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts_at")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimes_used(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times_used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimes_used: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times_used")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

