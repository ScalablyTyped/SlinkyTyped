package typingsSlinky.shopifyPrime.priceRuleDiscountCodeMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceRuleDiscountCode extends ShopifyObject {
  /**
    * The case-insensitive discount code that customers use at checkout. Required
    * when creating a discount. Maximum length of 255 characters.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * By default, this auto-generated property is the date and time when the price rule was
    * created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the price rule associated to the discount code.
    */
  var price_rule_id: js.UndefOr[Double] = js.native
  /**
    * The date and time the discount code was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * The discount code usage count. Note that the usage limit is set on the price rule.
    */
  var usage_count: js.UndefOr[Double] = js.native
}

object PriceRuleDiscountCode {
  @scala.inline
  def apply(): PriceRuleDiscountCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceRuleDiscountCode]
  }
  @scala.inline
  implicit class PriceRuleDiscountCodeOps[Self <: PriceRuleDiscountCode] (val x: Self) extends AnyVal {
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
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice_rule_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_rule_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice_rule_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_rule_id")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage_count")(js.undefined)
        ret
    }
  }
  
}

