package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.WhenOptionsBuilderFunction[T]
  - typingsSlinky.yup.mod.WhenOptionsBuilderObject
*/
trait WhenOptions[T] extends js.Object

object WhenOptions {
  @scala.inline
  implicit def apply[T](value: WhenOptionsBuilderFunction[T]): WhenOptions[T] = value.asInstanceOf[WhenOptions[T]]
  @scala.inline
  implicit def apply[T](value: WhenOptionsBuilderObject): WhenOptions[T] = value.asInstanceOf[WhenOptions[T]]
}

