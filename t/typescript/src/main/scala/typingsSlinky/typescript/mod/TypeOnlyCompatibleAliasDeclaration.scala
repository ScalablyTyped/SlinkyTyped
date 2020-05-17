package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ImportClause
  - typingsSlinky.typescript.mod.NamespaceImport
  - typingsSlinky.typescript.mod.ImportOrExportSpecifier
*/
trait TypeOnlyCompatibleAliasDeclaration extends js.Object

object TypeOnlyCompatibleAliasDeclaration {
  @scala.inline
  implicit def apply(value: ImportClause): TypeOnlyCompatibleAliasDeclaration = value.asInstanceOf[TypeOnlyCompatibleAliasDeclaration]
  @scala.inline
  implicit def apply(value: ImportOrExportSpecifier): TypeOnlyCompatibleAliasDeclaration = value.asInstanceOf[TypeOnlyCompatibleAliasDeclaration]
  @scala.inline
  implicit def apply(value: NamespaceImport): TypeOnlyCompatibleAliasDeclaration = value.asInstanceOf[TypeOnlyCompatibleAliasDeclaration]
}

