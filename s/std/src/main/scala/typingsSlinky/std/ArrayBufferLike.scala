package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.SharedArrayBuffer
  - typingsSlinky.std.ArrayBuffer
*/
trait ArrayBufferLike extends js.Object

object ArrayBufferLike {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): ArrayBufferLike = value.asInstanceOf[ArrayBufferLike]
  @scala.inline
  implicit def apply(value: SharedArrayBuffer): ArrayBufferLike = value.asInstanceOf[ArrayBufferLike]
}

