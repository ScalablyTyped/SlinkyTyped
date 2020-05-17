package typingsSlinky.typestubIpfs.mod

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.std.Blob
  - java.lang.String
*/
trait FileContent extends js.Object

object FileContent {
  @scala.inline
  implicit def apply(value: Blob): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: js.Object): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: String): FileContent = value.asInstanceOf[FileContent]
}

