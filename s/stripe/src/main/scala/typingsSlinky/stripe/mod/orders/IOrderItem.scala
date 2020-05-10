package typingsSlinky.stripe.mod.orders

import typingsSlinky.stripe.mod.IObject
import typingsSlinky.stripe.mod.skus.ISku
import typingsSlinky.stripe.stripeStrings.discount
import typingsSlinky.stripe.stripeStrings.order_item
import typingsSlinky.stripe.stripeStrings.shipping
import typingsSlinky.stripe.stripeStrings.sku
import typingsSlinky.stripe.stripeStrings.tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderItem extends IObject {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: Double = js.native
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: String = js.native
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String = js.native
  /**
    * value is "order_item"
    */
  @JSName("object")
  var object_IOrderItem: order_item = js.native
  /**
    * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU). [Expandable]
    */
  var parent: String | ISku = js.native
  /**
    * A positive integer representing the number of instances of parent that are included in this order item.
    * Applicable/present only if type is sku.
    */
  var quantity: Double = js.native
  /**
    * The type of line item. One of "sku", "tax", "shipping", or "discount".
    */
  var `type`: sku | tax | shipping | discount = js.native
}

object IOrderItem {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    description: String,
    `object`: order_item,
    parent: String | ISku,
    quantity: Double,
    `type`: sku | tax | shipping | discount
  ): IOrderItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderItem]
  }
  @scala.inline
  implicit class IOrderItemOps[Self <: IOrderItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: order_item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String | ISku): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: sku | tax | shipping | discount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

