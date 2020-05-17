package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Promise[T]
*/
trait MaybePromiseType[T] extends js.Object

object MaybePromiseType {
  @scala.inline
  implicit def apply[T](value: js.Promise[T]): MaybePromiseType[T] = value.asInstanceOf[MaybePromiseType[T]]
  @scala.inline
  implicit def apply[T](value: T): MaybePromiseType[T] = value.asInstanceOf[MaybePromiseType[T]]
}

