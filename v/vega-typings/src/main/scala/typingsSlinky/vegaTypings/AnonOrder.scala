package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends Compare {
  var field: String | ExprRef | SignalRef
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonOrder {
  @scala.inline
  def apply(field: String | ExprRef | SignalRef, order: SortOrder = null): AnonOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrder]
  }
}

