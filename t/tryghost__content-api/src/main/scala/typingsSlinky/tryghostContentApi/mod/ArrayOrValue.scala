package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait ArrayOrValue[T] extends js.Object

object ArrayOrValue {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): ArrayOrValue[T] = value.asInstanceOf[ArrayOrValue[T]]
  @scala.inline
  implicit def apply[T](value: T): ArrayOrValue[T] = value.asInstanceOf[ArrayOrValue[T]]
}

