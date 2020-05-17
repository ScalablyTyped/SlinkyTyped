package typingsSlinky.storybookAddonKnobs.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait RadiosTypeKnobValue extends js.Object

object RadiosTypeKnobValue {
  @scala.inline
  implicit def apply(value: Double): RadiosTypeKnobValue = value.asInstanceOf[RadiosTypeKnobValue]
  @scala.inline
  implicit def apply(value: Null): RadiosTypeKnobValue = value.asInstanceOf[RadiosTypeKnobValue]
  @scala.inline
  implicit def apply(value: String): RadiosTypeKnobValue = value.asInstanceOf[RadiosTypeKnobValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => RadiosTypeKnobValue): RadiosTypeKnobValue = value.asInstanceOf[RadiosTypeKnobValue]
}

