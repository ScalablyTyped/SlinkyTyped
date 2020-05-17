package typingsSlinky.stylenames.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - java.lang.String
  - typingsSlinky.stylenames.mod.StyleValueObject
*/
trait StyleValue extends js.Object

object StyleValue {
  @scala.inline
  implicit def apply(value: Null): StyleValue = value.asInstanceOf[StyleValue]
  @scala.inline
  implicit def apply(value: String): StyleValue = value.asInstanceOf[StyleValue]
  @scala.inline
  implicit def apply(value: StyleValueObject): StyleValue = value.asInstanceOf[StyleValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => StyleValue): StyleValue = value.asInstanceOf[StyleValue]
}

