package typingsSlinky.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snapshot which describes the status of a promise.
  * state may be one of:
  * "fulfilled" - the promise has resolved
  * "rejected" - the promise has rejected
  * "pending" - the promise is still pending to resolve/reject
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.when.When.FulfilledDescriptor[T]
  - typingsSlinky.when.When.RejectedDescriptor
  - typingsSlinky.when.When.PendingDescriptor
*/
trait Snapshot[T] extends js.Object

object Snapshot {
  @scala.inline
  implicit def apply[T](value: FulfilledDescriptor[T]): Snapshot[T] = value.asInstanceOf[Snapshot[T]]
  @scala.inline
  implicit def apply[T](value: PendingDescriptor): Snapshot[T] = value.asInstanceOf[Snapshot[T]]
  @scala.inline
  implicit def apply[T](value: RejectedDescriptor): Snapshot[T] = value.asInstanceOf[Snapshot[T]]
}

