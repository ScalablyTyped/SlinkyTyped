package typingsSlinky.storybookAddonKnobs.optionsMod

import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[typingsSlinky.std.NonNullable[T]]
*/
trait OptionsTypeKnobValue[T /* <: OptionsTypeKnobSingleValue */] extends js.Object

object OptionsTypeKnobValue {
  @scala.inline
  implicit def apply[T](value: js.Array[NonNullable[T]]): OptionsTypeKnobValue[T] = value.asInstanceOf[OptionsTypeKnobValue[T]]
  @scala.inline
  implicit def apply[T](value: T): OptionsTypeKnobValue[T] = value.asInstanceOf[OptionsTypeKnobValue[T]]
}

