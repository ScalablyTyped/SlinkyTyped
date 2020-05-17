package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Uint32Array
  - js.Array[typingsSlinky.std.GLuint]
*/
trait Uint32List extends js.Object

object Uint32List {
  @scala.inline
  implicit def apply(value: js.Array[GLuint]): Uint32List = value.asInstanceOf[Uint32List]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): Uint32List = value.asInstanceOf[Uint32List]
}

