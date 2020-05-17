package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.PreserveNull[T]
  - typingsSlinky.yup.mod.PreserveUndefined[T]
*/
trait PreserveOptionals[T]
  extends InnerInferType[T]
     with Shape[T, js.Any]

object PreserveOptionals {
  @scala.inline
  implicit def apply[T](value: PreserveNull[T]): PreserveOptionals[T] = value.asInstanceOf[PreserveOptionals[T]]
  @scala.inline
  implicit def apply[T](value: PreserveUndefined[T]): PreserveOptionals[T] = value.asInstanceOf[PreserveOptionals[T]]
}

