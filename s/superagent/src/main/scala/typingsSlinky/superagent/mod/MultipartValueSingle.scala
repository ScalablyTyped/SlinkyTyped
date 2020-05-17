package typingsSlinky.superagent.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Blob
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.fsMod.ReadStream
  - java.lang.String
  - scala.Boolean
  - scala.Double
*/
trait MultipartValueSingle extends MultipartValue

object MultipartValueSingle {
  @scala.inline
  implicit def apply(value: Blob): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
  @scala.inline
  implicit def apply(value: Boolean): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
  @scala.inline
  implicit def apply(value: Buffer): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
  @scala.inline
  implicit def apply(value: Double): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
  @scala.inline
  implicit def apply(value: ReadStream): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
  @scala.inline
  implicit def apply(value: String): MultipartValueSingle = value.asInstanceOf[MultipartValueSingle]
}

