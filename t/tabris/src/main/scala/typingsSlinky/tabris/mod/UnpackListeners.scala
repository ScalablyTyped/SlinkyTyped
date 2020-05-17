package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.tabris.mod.Listener[js.Any]
*/
trait UnpackListeners[T] extends js.Object

object UnpackListeners {
  @scala.inline
  implicit def apply[T](value: Listener[js.Any]): UnpackListeners[T] = value.asInstanceOf[UnpackListeners[T]]
  @scala.inline
  implicit def apply[T](value: T): UnpackListeners[T] = value.asInstanceOf[UnpackListeners[T]]
}

