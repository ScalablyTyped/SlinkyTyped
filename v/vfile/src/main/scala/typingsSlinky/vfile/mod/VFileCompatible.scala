package typingsSlinky.vfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vfile.mod.VFile
  - typingsSlinky.vfile.mod.VFileOptions
  - typingsSlinky.vfile.mod.VFileContents
*/
trait VFileCompatible extends js.Object

object VFileCompatible {
  @scala.inline
  implicit def apply(value: VFile): VFileCompatible = value.asInstanceOf[VFileCompatible]
  @scala.inline
  implicit def apply(value: VFileContents): VFileCompatible = value.asInstanceOf[VFileCompatible]
  @scala.inline
  implicit def apply(value: VFileOptions): VFileCompatible = value.asInstanceOf[VFileCompatible]
}

