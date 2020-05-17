package typingsSlinky.yup.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.yupStrings.Shape with org.scalablytyped.runtime.TopLevel[js.Any] with U
  - typingsSlinky.yup.mod.PreserveOptionals[T]
*/
trait Shape[T /* <: js.UndefOr[js.Object | Null] */, U /* <: js.Object */] extends js.Object

object Shape {
  @scala.inline
  implicit def apply[T, U](value: typingsSlinky.yup.yupStrings.Shape with TopLevel[js.Any] with U): Shape[T, U] = value.asInstanceOf[Shape[T, U]]
  @scala.inline
  implicit def apply[T, U](value: PreserveOptionals[T]): Shape[T, U] = value.asInstanceOf[Shape[T, U]]
}

