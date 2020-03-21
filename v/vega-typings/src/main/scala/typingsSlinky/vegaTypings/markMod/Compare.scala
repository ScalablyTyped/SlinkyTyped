package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.AnonOrder
  - typingsSlinky.vegaTypings.AnonFieldOrder
*/
trait Compare extends js.Object

object Compare {
  @scala.inline
  def AnonOrder(field: String | ExprRef | SignalRef, order: SortOrder = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
  @scala.inline
  def AnonFieldOrder(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): Compare = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compare]
  }
}

