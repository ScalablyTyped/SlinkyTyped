package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
  - js.UndefOr[scala.Nothing]
*/
trait Flatten[T] extends js.Object

object Flatten {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): Flatten[T] = value.asInstanceOf[Flatten[T]]
  @scala.inline
  implicit def apply[T](value: T): Flatten[T] = value.asInstanceOf[Flatten[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => Flatten[T]): Flatten[T] = value.asInstanceOf[Flatten[T]]
}

