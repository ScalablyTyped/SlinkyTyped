package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
*/
trait PreserveUndefined[T] extends PreserveOptionals[T]

object PreserveUndefined {
  @scala.inline
  implicit def apply[T](value: scala.Nothing): PreserveUndefined[T] = value.asInstanceOf[PreserveUndefined[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => PreserveUndefined[T]): PreserveUndefined[T] = value.asInstanceOf[PreserveUndefined[T]]
}

