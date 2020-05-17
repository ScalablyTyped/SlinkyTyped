package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Float32Array
  - js.Array[typingsSlinky.std.GLfloat]
*/
trait Float32List extends js.Object

object Float32List {
  @scala.inline
  implicit def apply(value: js.Array[GLfloat]): Float32List = value.asInstanceOf[Float32List]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): Float32List = value.asInstanceOf[Float32List]
}

