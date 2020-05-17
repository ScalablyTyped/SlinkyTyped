package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBufferView
  - typingsSlinky.std.ArrayBuffer
*/
trait BufferSource
  extends BlobPart
     with BodyInit
     with IDBValidKey

object BufferSource {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BufferSource = value.asInstanceOf[BufferSource]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): BufferSource = value.asInstanceOf[BufferSource]
}

