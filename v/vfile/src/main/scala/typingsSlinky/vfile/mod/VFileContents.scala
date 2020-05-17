package typingsSlinky.vfile.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait VFileContents extends VFileCompatible

object VFileContents {
  @scala.inline
  implicit def apply(value: Buffer): VFileContents = value.asInstanceOf[VFileContents]
  @scala.inline
  implicit def apply(value: String): VFileContents = value.asInstanceOf[VFileContents]
}

