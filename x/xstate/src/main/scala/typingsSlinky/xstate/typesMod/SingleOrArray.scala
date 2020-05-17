package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - T
*/
trait SingleOrArray[T] extends js.Object

object SingleOrArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): SingleOrArray[T] = value.asInstanceOf[SingleOrArray[T]]
  @scala.inline
  implicit def apply[T](value: T): SingleOrArray[T] = value.asInstanceOf[SingleOrArray[T]]
}

