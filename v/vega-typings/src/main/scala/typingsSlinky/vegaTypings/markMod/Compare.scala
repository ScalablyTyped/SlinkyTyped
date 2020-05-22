package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.anon.Order
  - typingsSlinky.vegaTypings.anon.FieldOrder
*/
trait Compare extends js.Object

object Compare {
  @scala.inline
  def Order(field: String | ExprRef | SignalRef, order: SortOrder = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
  @scala.inline
  def FieldOrder(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
}

