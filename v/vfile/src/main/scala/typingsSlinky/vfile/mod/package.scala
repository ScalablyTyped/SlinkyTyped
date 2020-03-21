package typingsSlinky.vfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vfile.mod.VFile
    - typingsSlinky.vfile.mod.VFileOptions
    - typingsSlinky.vfile.mod.VFileContents
  */
  type VFileCompatible = typingsSlinky.vfile.mod._VFileCompatible | typingsSlinky.vfile.mod.VFileContents
  type VFileContents = java.lang.String | typingsSlinky.node.Buffer
}
