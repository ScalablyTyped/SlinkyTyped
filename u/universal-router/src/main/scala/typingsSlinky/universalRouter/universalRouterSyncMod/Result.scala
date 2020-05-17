package typingsSlinky.universalRouter.universalRouterSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - scala.Unit
*/
trait Result[T] extends js.Object

object Result {
  @scala.inline
  implicit def apply[T](value: T): Result[T] = value.asInstanceOf[Result[T]]
  @scala.inline
  implicit def apply[T](value: Unit): Result[T] = value.asInstanceOf[Result[T]]
}

