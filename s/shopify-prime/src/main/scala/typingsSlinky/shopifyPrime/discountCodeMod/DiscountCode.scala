package typingsSlinky.shopifyPrime.discountCodeMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.percentage
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountCode extends ShopifyObject {
  /**
    *  The amount of the discount.
    */
  var amount: js.UndefOr[String] = js.undefined
  /**
    *  The discount code.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    *  The type of discount. Known values are 'percentage', 'shipping', 'fixed_amount' and 'none'.
    */
  var `type`: js.UndefOr[percentage | shipping | fixed_amount | String] = js.undefined
}

object DiscountCode {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    amount: String = null,
    code: String = null,
    id: js.UndefOr[Double] = js.undefined,
    `type`: percentage | shipping | fixed_amount | String = null
  ): DiscountCode = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountCode]
  }
}

