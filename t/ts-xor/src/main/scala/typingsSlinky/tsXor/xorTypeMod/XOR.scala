package typingsSlinky.tsXor.xorTypeMod

import typingsSlinky.tsXor.withoutTypeMod.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - U
  - (typingsSlinky.tsXor.withoutTypeMod.Without[T, U]) with U
  - (typingsSlinky.tsXor.withoutTypeMod.Without[U, T]) with T
*/
trait XOR[T, U] extends js.Object

object XOR {
  @scala.inline
  implicit def apply[T, U](value: (Without[T, U]) with U with (Without[U, T]) with T): XOR[T, U] = value.asInstanceOf[XOR[T, U]]
  @scala.inline
  implicit def apply[T, U](value: T | U): XOR[T, U] = value.asInstanceOf[XOR[T, U]]
}

