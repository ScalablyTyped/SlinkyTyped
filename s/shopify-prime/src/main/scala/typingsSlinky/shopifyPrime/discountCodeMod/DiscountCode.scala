package typingsSlinky.shopifyPrime.discountCodeMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.percentage
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.shipping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscountCode extends ShopifyObject {
  /**
    *  The amount of the discount.
    */
  var amount: js.UndefOr[String] = js.native
  /**
    *  The discount code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    *  The type of discount. Known values are 'percentage', 'shipping', 'fixed_amount' and 'none'.
    */
  var `type`: js.UndefOr[percentage | shipping | fixed_amount | String] = js.native
}

object DiscountCode {
  @scala.inline
  def apply(): DiscountCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscountCode]
  }
  @scala.inline
  implicit class DiscountCodeOps[Self <: DiscountCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
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
    def withType(value: percentage | shipping | fixed_amount | String): Self = {
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

