package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import typingsSlinky.vegaTypings.vegaTypingsStrings.max
import typingsSlinky.vegaTypings.vegaTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnionSortField extends js.Object

object _UnionSortField {
  @scala.inline
  def AnonOpOrder(op: count): _UnionSortField = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
  @scala.inline
  def AnonFieldOp(field: ScaleField, op: count | min | max): _UnionSortField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
}

