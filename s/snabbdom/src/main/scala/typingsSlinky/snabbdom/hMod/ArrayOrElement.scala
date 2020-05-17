package typingsSlinky.snabbdom.hMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait ArrayOrElement[T] extends js.Object

object ArrayOrElement {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): ArrayOrElement[T] = value.asInstanceOf[ArrayOrElement[T]]
  @scala.inline
  implicit def apply[T](value: T): ArrayOrElement[T] = value.asInstanceOf[ArrayOrElement[T]]
}

