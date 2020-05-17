package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Values
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.Variable
  - typingsSlinky.typedGraphql.mod.IntValue
  - typingsSlinky.typedGraphql.mod.FloatValue
  - typingsSlinky.typedGraphql.mod.StringValue
  - typingsSlinky.typedGraphql.mod.BooleanValue
  - typingsSlinky.typedGraphql.mod.EnumValue
  - typingsSlinky.typedGraphql.mod.ListValue
  - typingsSlinky.typedGraphql.mod.ObjectValue
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: BooleanValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: EnumValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: FloatValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: IntValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: ListValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: ObjectValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: StringValue): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: Variable): Value = value.asInstanceOf[Value]
}

