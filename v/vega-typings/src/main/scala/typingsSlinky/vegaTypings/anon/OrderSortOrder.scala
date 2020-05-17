package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.scaleMod.SortField
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderSortOrder extends SortField {
  var order: SortOrder = js.native
}

object OrderSortOrder {
  @scala.inline
  def apply(order: SortOrder): OrderSortOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderSortOrder]
  }
  @scala.inline
  implicit class OrderSortOrderOps[Self <: OrderSortOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

