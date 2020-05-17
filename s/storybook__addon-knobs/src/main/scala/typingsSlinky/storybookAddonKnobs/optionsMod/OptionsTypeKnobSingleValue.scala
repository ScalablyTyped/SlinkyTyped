package typingsSlinky.storybookAddonKnobs.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - js.Array[scala.Double | java.lang.String]
*/
trait OptionsTypeKnobSingleValue extends js.Object

object OptionsTypeKnobSingleValue {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): OptionsTypeKnobSingleValue = value.asInstanceOf[OptionsTypeKnobSingleValue]
  @scala.inline
  implicit def apply(value: Double): OptionsTypeKnobSingleValue = value.asInstanceOf[OptionsTypeKnobSingleValue]
  @scala.inline
  implicit def apply(value: Null): OptionsTypeKnobSingleValue = value.asInstanceOf[OptionsTypeKnobSingleValue]
  @scala.inline
  implicit def apply(value: String): OptionsTypeKnobSingleValue = value.asInstanceOf[OptionsTypeKnobSingleValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => OptionsTypeKnobSingleValue): OptionsTypeKnobSingleValue = value.asInstanceOf[OptionsTypeKnobSingleValue]
}

