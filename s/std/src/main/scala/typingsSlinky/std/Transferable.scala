package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.MessagePort
  - typingsSlinky.std.ImageBitmap
  - typingsSlinky.std.OffscreenCanvas
*/
trait Transferable extends js.Object

object Transferable {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Transferable = value.asInstanceOf[Transferable]
  @scala.inline
  implicit def apply(value: ImageBitmap): Transferable = value.asInstanceOf[Transferable]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.MessagePort): Transferable = value.asInstanceOf[Transferable]
  @scala.inline
  implicit def apply(value: OffscreenCanvas): Transferable = value.asInstanceOf[Transferable]
}

