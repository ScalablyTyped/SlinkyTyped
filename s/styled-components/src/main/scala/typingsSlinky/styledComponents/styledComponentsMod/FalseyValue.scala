package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.styledComponents.styledComponentsBooleans.`false`
*/
trait FalseyValue extends InterpolationValue

object FalseyValue {
  @scala.inline
  def `false`: typingsSlinky.styledComponents.styledComponentsBooleans.`false` = false.asInstanceOf[typingsSlinky.styledComponents.styledComponentsBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): FalseyValue = value.asInstanceOf[FalseyValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => FalseyValue): FalseyValue = value.asInstanceOf[FalseyValue]
}

