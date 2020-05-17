package typingsSlinky.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the outcome of a promise.
  * state may be one of:
  * "fulfilled" - the promise has resolved
  * "rejected" - the promise has rejected
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.when.When.FulfilledDescriptor[T]
  - typingsSlinky.when.When.RejectedDescriptor
*/
trait Descriptor[T] extends js.Object

object Descriptor {
  @scala.inline
  implicit def apply[T](value: FulfilledDescriptor[T]): Descriptor[T] = value.asInstanceOf[Descriptor[T]]
  @scala.inline
  implicit def apply[T](value: RejectedDescriptor): Descriptor[T] = value.asInstanceOf[Descriptor[T]]
}

