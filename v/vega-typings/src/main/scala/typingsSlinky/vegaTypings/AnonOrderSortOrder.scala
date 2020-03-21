package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrderSortOrder extends _SortField {
  var order: SortOrder
}

object AnonOrderSortOrder {
  @scala.inline
  def apply(order: SortOrder): AnonOrderSortOrder = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrderSortOrder]
  }
}

