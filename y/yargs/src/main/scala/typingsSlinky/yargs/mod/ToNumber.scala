package typingsSlinky.yargs.mod

import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives number[] if T is an array type, otherwise number. Preserves | undefined. */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.std.Extract[T, js.UndefOr[scala.Nothing]]
*/
trait ToNumber[T] extends js.Object

object ToNumber {
  @scala.inline
  implicit def apply[T](value: js.Array[Double]): ToNumber[T] = value.asInstanceOf[ToNumber[T]]
  @scala.inline
  implicit def apply[T](value: Double): ToNumber[T] = value.asInstanceOf[ToNumber[T]]
  @scala.inline
  implicit def apply[T](value: Extract[T, js.UndefOr[scala.Nothing]]): ToNumber[T] = value.asInstanceOf[ToNumber[T]]
}

