package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportClause
  extends NamedDeclaration
     with TypeOnlyCompatibleAliasDeclaration {
  var isTypeOnly: Boolean = js.native
  @JSName("kind")
  var kind_ImportClause: typingsSlinky.typescript.mod.SyntaxKind.ImportClause = js.native
  @JSName("name")
  var name_ImportClause: js.UndefOr[Identifier] = js.native
  var namedBindings: js.UndefOr[NamedImportBindings] = js.native
  @JSName("parent")
  var parent_ImportClause: ImportDeclaration = js.native
}

