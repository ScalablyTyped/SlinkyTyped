package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.scaleMod.ScaleField
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOp extends _SortField {
  var field: js.UndefOr[ScaleField] = js.undefined
  var op: ScaleField
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonOp {
  @scala.inline
  def apply(op: ScaleField, field: ScaleField = null, order: SortOrder = null): AnonOp = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOp]
  }
}

