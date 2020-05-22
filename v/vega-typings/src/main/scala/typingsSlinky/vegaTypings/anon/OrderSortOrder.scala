package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderSortOrder extends _SortField {
  var order: SortOrder
}

object OrderSortOrder {
  @scala.inline
  def apply(order: SortOrder): OrderSortOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderSortOrder]
  }
}

