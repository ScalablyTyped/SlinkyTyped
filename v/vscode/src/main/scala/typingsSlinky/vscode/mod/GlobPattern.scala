package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vscode.mod.RelativePattern
*/
trait GlobPattern extends js.Object

object GlobPattern {
  @scala.inline
  implicit def apply(value: RelativePattern): GlobPattern = value.asInstanceOf[GlobPattern]
  @scala.inline
  implicit def apply(value: String): GlobPattern = value.asInstanceOf[GlobPattern]
}

