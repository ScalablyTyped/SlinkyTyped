package typingsSlinky.spected.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Symbol
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - js.Object
  - js.Function2[/ * value * / INPUT, / * field * / java.lang.String, js.Any]
*/
trait ErrorMsg[INPUT] extends js.Object

object ErrorMsg {
  @scala.inline
  implicit def apply[INPUT](value: Boolean): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: Double): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: js.Function2[/* value */ INPUT, /* field */ String, js.Any]): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: Null): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: js.Object): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: String): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def apply[INPUT](value: js.Symbol): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
  @scala.inline
  implicit def fromUndef[INPUT, T](value: js.UndefOr[T])(implicit ev: T => ErrorMsg[INPUT]): ErrorMsg[INPUT] = value.asInstanceOf[ErrorMsg[INPUT]]
}

