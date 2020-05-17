package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.Id[
typingsSlinky.yup.mod.NotRequiredProps[_] with typingsSlinky.yup.mod.RequiredProps[_]]
  - js.Array[js.Any]
  - typingsSlinky.yup.mod.PreserveOptionals[T]
*/
trait InnerInferType[T] extends js.Object

object InnerInferType {
  @scala.inline
  implicit def apply[T](value: js.Array[js.Any]): InnerInferType[T] = value.asInstanceOf[InnerInferType[T]]
  @scala.inline
  implicit def apply[T](value: Id[NotRequiredProps[_] with RequiredProps[_]]): InnerInferType[T] = value.asInstanceOf[InnerInferType[T]]
  @scala.inline
  implicit def apply[T](value: PreserveOptionals[T]): InnerInferType[T] = value.asInstanceOf[InnerInferType[T]]
}

