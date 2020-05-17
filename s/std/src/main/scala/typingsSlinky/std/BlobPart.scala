package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.BufferSource
  - typingsSlinky.std.Blob
  - java.lang.String
*/
trait BlobPart extends js.Object

object BlobPart {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.Blob): BlobPart = value.asInstanceOf[BlobPart]
  @scala.inline
  implicit def apply(value: BufferSource): BlobPart = value.asInstanceOf[BlobPart]
  @scala.inline
  implicit def apply(value: java.lang.String): BlobPart = value.asInstanceOf[BlobPart]
}

