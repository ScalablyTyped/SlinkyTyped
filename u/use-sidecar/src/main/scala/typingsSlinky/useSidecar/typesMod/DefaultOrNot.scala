package typingsSlinky.useSidecar.typesMod

import typingsSlinky.useSidecar.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.useSidecar.anon.Default[T]
  - T
*/
trait DefaultOrNot[T] extends js.Object

object DefaultOrNot {
  @scala.inline
  implicit def apply[T](value: Default[T]): DefaultOrNot[T] = value.asInstanceOf[DefaultOrNot[T]]
  @scala.inline
  implicit def apply[T](value: T): DefaultOrNot[T] = value.asInstanceOf[DefaultOrNot[T]]
}

