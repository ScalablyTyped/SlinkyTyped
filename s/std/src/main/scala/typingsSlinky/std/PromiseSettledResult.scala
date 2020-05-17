package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.PromiseFulfilledResult[T]
  - typingsSlinky.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends js.Object

object PromiseSettledResult {
  @scala.inline
  implicit def apply[T](value: PromiseFulfilledResult[T]): PromiseSettledResult[T] = value.asInstanceOf[PromiseSettledResult[T]]
  @scala.inline
  implicit def apply[T](value: PromiseRejectedResult): PromiseSettledResult[T] = value.asInstanceOf[PromiseSettledResult[T]]
}

