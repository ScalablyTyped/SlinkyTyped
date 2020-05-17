package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
  - js.UndefOr[scala.Nothing]
*/
trait VisitResult[T /* <: Node */] extends js.Object

object VisitResult {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): VisitResult[T] = value.asInstanceOf[VisitResult[T]]
  @scala.inline
  implicit def apply[T](value: T): VisitResult[T] = value.asInstanceOf[VisitResult[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => VisitResult[T]): VisitResult[T] = value.asInstanceOf[VisitResult[T]]
}

