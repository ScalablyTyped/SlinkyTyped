package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.NamespaceImport
  - typingsSlinky.typescript.mod.NamedImports
*/
trait NamedImportBindings extends js.Object

object NamedImportBindings {
  @scala.inline
  implicit def apply(value: NamedImports): NamedImportBindings = value.asInstanceOf[NamedImportBindings]
  @scala.inline
  implicit def apply(value: NamespaceImport): NamedImportBindings = value.asInstanceOf[NamedImportBindings]
}

