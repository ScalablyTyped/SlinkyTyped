package typingsSlinky.shopifyPrime.draftLineItemMod

import typingsSlinky.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typingsSlinky.shopifyPrime.lineItemMod.LineItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftLineItem extends LineItem {
  /**
    * Discount which will be applied to the line item or the overall order.
    */
  var applied_discount: AppliedDiscount = js.native
  /**
    * Indicates if this is a product variant line item, or a custom line item. If set to true indicates a custom line item. If set to false indicates a product variant line item. This is a read only field.
    */
  var custom: js.UndefOr[Boolean] = js.native
}

object DraftLineItem {
  @scala.inline
  def apply(applied_discount: AppliedDiscount): DraftLineItem = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftLineItem]
  }
  @scala.inline
  implicit class DraftLineItemOps[Self <: DraftLineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplied_discount(value: AppliedDiscount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applied_discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
  }
  
}

