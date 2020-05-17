package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Int32Array
  - js.Array[typingsSlinky.std.GLint]
*/
trait Int32List extends js.Object

object Int32List {
  @scala.inline
  implicit def apply(value: js.Array[GLint]): Int32List = value.asInstanceOf[Int32List]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): Int32List = value.asInstanceOf[Int32List]
}

