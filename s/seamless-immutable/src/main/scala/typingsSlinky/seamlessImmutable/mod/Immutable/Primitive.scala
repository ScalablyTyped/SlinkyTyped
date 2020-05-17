package typingsSlinky.seamlessImmutable.mod.Immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - js.Symbol
  - typingsSlinky.seamlessImmutable.mod.Immutable.AnyFunction
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait Primitive
  extends CannotMakeImmutable[js.Any]

object Primitive {
  @scala.inline
  implicit def apply(value: AnyFunction): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Null): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Symbol): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Primitive): Primitive = value.asInstanceOf[Primitive]
}

