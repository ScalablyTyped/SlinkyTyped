package typingsSlinky.shpjs.mod

import typingsSlinky.shpjs.anon.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All toBuffer() compatible buffers.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.shpjs.anon.Buffer
*/
trait ShpJSBuffer extends js.Object

object ShpJSBuffer {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): ShpJSBuffer = value.asInstanceOf[ShpJSBuffer]
  @scala.inline
  implicit def apply(value: Buffer): ShpJSBuffer = value.asInstanceOf[ShpJSBuffer]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.Buffer): ShpJSBuffer = value.asInstanceOf[ShpJSBuffer]
}

