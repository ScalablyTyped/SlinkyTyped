package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ModuleBlock
  - typingsSlinky.typescript.mod.NamespaceDeclaration
*/
trait NamespaceBody extends ModuleBody

object NamespaceBody {
  @scala.inline
  implicit def apply(value: ModuleBlock): NamespaceBody = value.asInstanceOf[NamespaceBody]
  @scala.inline
  implicit def apply(value: NamespaceDeclaration): NamespaceBody = value.asInstanceOf[NamespaceBody]
}

