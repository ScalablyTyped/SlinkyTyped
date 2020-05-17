package typingsSlinky.zipkin.mod.option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zipkin.mod.option.Some[T]
  - typingsSlinky.zipkin.mod.option.INone[T]
*/
trait IOption[T] extends js.Object

object IOption {
  @scala.inline
  implicit def apply[T](value: INone[T]): IOption[T] = value.asInstanceOf[IOption[T]]
  @scala.inline
  implicit def apply[T](value: Some[T]): IOption[T] = value.asInstanceOf[IOption[T]]
}

