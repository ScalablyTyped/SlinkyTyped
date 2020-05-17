package typingsSlinky.storybookAddonKnobs.selectMod

import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - js.Array[typingsSlinky.std.PropertyKey]
*/
trait SelectTypeKnobValue extends js.Object

object SelectTypeKnobValue {
  @scala.inline
  implicit def apply(value: js.Array[PropertyKey]): SelectTypeKnobValue = value.asInstanceOf[SelectTypeKnobValue]
  @scala.inline
  implicit def apply(value: Double): SelectTypeKnobValue = value.asInstanceOf[SelectTypeKnobValue]
  @scala.inline
  implicit def apply(value: Null): SelectTypeKnobValue = value.asInstanceOf[SelectTypeKnobValue]
  @scala.inline
  implicit def apply(value: String): SelectTypeKnobValue = value.asInstanceOf[SelectTypeKnobValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => SelectTypeKnobValue): SelectTypeKnobValue = value.asInstanceOf[SelectTypeKnobValue]
}

