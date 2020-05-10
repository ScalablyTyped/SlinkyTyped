package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cart extends GraphModel {
  /**
    * Get checkout URL for current cart
    */
  var checkoutUrl: String = js.native
  /**
    * get ID for current cart
    */
  var id: String | Double = js.native
  /**
    * Gets the total quantity of all line items. Example: you've added two variants
    * with quantities 3 and 2. lineItemCount will be 5.
    */
  var lineItemCount: Double = js.native
  /**
    * Get an Array of CartLineItemModel's
    */
  var lineItems: js.Array[LineItem] = js.native
  /**
    * Get current subtotal price for all line items, before shipping, taxes, and discounts.
    * Example: two items have been added to the cart that cost $1.25 then the subtotal will be 2.50
    */
  var subtotalPrice: String = js.native
}

object Cart {
  @scala.inline
  def apply(
    checkoutUrl: String,
    id: String | Double,
    lineItemCount: Double,
    lineItems: js.Array[LineItem],
    subtotalPrice: String
  ): Cart = {
    val __obj = js.Dynamic.literal(checkoutUrl = checkoutUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItemCount = lineItemCount.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], subtotalPrice = subtotalPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cart]
  }
  @scala.inline
  implicit class CartOps[Self <: Cart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckoutUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[LineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtotalPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalPrice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

