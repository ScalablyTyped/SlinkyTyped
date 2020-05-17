package typingsSlinky.yargs.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Convert T to T[] and T | undefined to T[] | undefined */
/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.std.Exclude[T, js.UndefOr[scala.Nothing]]]
  - typingsSlinky.std.Extract[T, js.UndefOr[scala.Nothing]]
*/
trait ToArray[T] extends js.Object

object ToArray {
  @scala.inline
  implicit def apply[T](value: js.Array[Exclude[T, js.UndefOr[scala.Nothing]]]): ToArray[T] = value.asInstanceOf[ToArray[T]]
  @scala.inline
  implicit def apply[T](value: Extract[T, js.UndefOr[scala.Nothing]]): ToArray[T] = value.asInstanceOf[ToArray[T]]
}

