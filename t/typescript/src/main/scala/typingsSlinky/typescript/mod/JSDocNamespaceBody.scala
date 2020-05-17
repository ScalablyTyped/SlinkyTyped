package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.Identifier
  - typingsSlinky.typescript.mod.JSDocNamespaceDeclaration
*/
trait JSDocNamespaceBody extends ModuleBody

object JSDocNamespaceBody {
  @scala.inline
  implicit def apply(value: Identifier): JSDocNamespaceBody = value.asInstanceOf[JSDocNamespaceBody]
  @scala.inline
  implicit def apply(value: JSDocNamespaceDeclaration): JSDocNamespaceBody = value.asInstanceOf[JSDocNamespaceBody]
}

