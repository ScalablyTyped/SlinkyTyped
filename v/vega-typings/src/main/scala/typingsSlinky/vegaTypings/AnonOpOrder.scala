package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._UnionSortField
import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpOrder extends _UnionSortField {
  var op: count
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonOpOrder {
  @scala.inline
  def apply(op: count, order: SortOrder = null): AnonOpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpOrder]
  }
}

