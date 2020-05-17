package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ReadableStreamReadValueResult[T]
  - typingsSlinky.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends js.Object

object ReadableStreamReadResult {
  @scala.inline
  implicit def apply[T](value: ReadableStreamReadDoneResult[T]): ReadableStreamReadResult[T] = value.asInstanceOf[ReadableStreamReadResult[T]]
  @scala.inline
  implicit def apply[T](value: ReadableStreamReadValueResult[T]): ReadableStreamReadResult[T] = value.asInstanceOf[ReadableStreamReadResult[T]]
}

