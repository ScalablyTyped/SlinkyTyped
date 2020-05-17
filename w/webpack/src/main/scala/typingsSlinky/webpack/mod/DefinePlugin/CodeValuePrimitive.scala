package typingsSlinky.webpack.mod.DefinePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.std.RegExp
  - typingsSlinky.webpack.mod.DefinePlugin.RuntimeValue
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait CodeValuePrimitive extends CodeValueObject

object CodeValuePrimitive {
  @scala.inline
  implicit def apply(value: Boolean): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def apply(value: Double): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def apply(value: Null): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def apply(value: js.RegExp): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def apply(value: RuntimeValue): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def apply(value: String): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CodeValuePrimitive): CodeValuePrimitive = value.asInstanceOf[CodeValuePrimitive]
}

