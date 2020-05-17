package typingsSlinky.styledSystem.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - typingsSlinky.std.Record[K, T | (typingsSlinky.std.Record[K, T]) | js.Array[T]]
*/
trait ObjectOrArray[T, K /* <: /* keyof any */ String */] extends js.Object

object ObjectOrArray {
  @scala.inline
  implicit def apply[T, K](value: js.Array[T]): ObjectOrArray[T, K] = value.asInstanceOf[ObjectOrArray[T, K]]
  @scala.inline
  implicit def apply[T, K](value: Record[K, T | (Record[K, T]) | js.Array[T]]): ObjectOrArray[T, K] = value.asInstanceOf[ObjectOrArray[T, K]]
}

