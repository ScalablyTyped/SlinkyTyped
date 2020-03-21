package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.ScaleField
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._UnionSortField
import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import typingsSlinky.vegaTypings.vegaTypingsStrings.max
import typingsSlinky.vegaTypings.vegaTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldOp extends _UnionSortField {
  var field: ScaleField
  var op: count | min | max
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonFieldOp {
  @scala.inline
  def apply(field: ScaleField, op: count | min | max, order: SortOrder = null): AnonFieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldOp]
  }
}

