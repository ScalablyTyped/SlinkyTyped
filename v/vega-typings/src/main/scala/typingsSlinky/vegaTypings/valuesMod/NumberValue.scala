package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.encodeMod.NumericValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.vegaTypings.encodeMod.NumericValueRef
*/
trait NumberValue extends js.Object

object NumberValue {
  @scala.inline
  implicit def apply(value: Double): NumberValue = value.asInstanceOf[NumberValue]
  @scala.inline
  implicit def apply(value: NumericValueRef): NumberValue = value.asInstanceOf[NumberValue]
}

