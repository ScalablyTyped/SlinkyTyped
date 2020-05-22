package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.markMod.Compare
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOrder extends Compare {
  var field: js.Array[String | ExprRef | SignalRef]
  var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
}

object FieldOrder {
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
}

