package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceImport
  extends NamedDeclaration
     with NamedImportBindings
     with TypeOnlyCompatibleAliasDeclaration {
  
  @JSName("kind")
  val kind_NamespaceImport: typingsSlinky.typescript.mod.SyntaxKind.NamespaceImport = js.native
  
  @JSName("name")
  val name_NamespaceImport: Identifier = js.native
  
  @JSName("parent")
  val parent_NamespaceImport: ImportClause = js.native
}
