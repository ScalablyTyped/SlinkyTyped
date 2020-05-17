package typingsSlinky.useCallbackRef.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.useCallbackRef.typesMod.RefCallback[T]
  - typingsSlinky.useCallbackRef.typesMod.RefObject[T]
*/
trait ReactRef[T] extends js.Object

object ReactRef {
  @scala.inline
  implicit def apply[T](value: RefCallback[T]): ReactRef[T] = value.asInstanceOf[ReactRef[T]]
  @scala.inline
  implicit def apply[T](value: RefObject[T]): ReactRef[T] = value.asInstanceOf[ReactRef[T]]
}

