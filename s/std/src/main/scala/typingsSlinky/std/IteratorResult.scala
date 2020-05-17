package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.IteratorYieldResult[T]
  - typingsSlinky.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends js.Object

object IteratorResult {
  @scala.inline
  implicit def apply[T, TReturn](value: IteratorReturnResult[TReturn]): IteratorResult[T, TReturn] = value.asInstanceOf[IteratorResult[T, TReturn]]
  @scala.inline
  implicit def apply[T, TReturn](value: IteratorYieldResult[T]): IteratorResult[T, TReturn] = value.asInstanceOf[IteratorResult[T, TReturn]]
}

