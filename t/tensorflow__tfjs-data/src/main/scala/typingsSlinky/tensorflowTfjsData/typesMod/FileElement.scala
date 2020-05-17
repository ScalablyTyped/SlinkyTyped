package typingsSlinky.tensorflowTfjsData.typesMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.File
  - typingsSlinky.std.Blob
  - typingsSlinky.std.Uint8Array
*/
trait FileElement extends js.Object

object FileElement {
  @scala.inline
  implicit def apply(value: Blob): FileElement = value.asInstanceOf[FileElement]
  @scala.inline
  implicit def apply(value: File): FileElement = value.asInstanceOf[FileElement]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): FileElement = value.asInstanceOf[FileElement]
}

