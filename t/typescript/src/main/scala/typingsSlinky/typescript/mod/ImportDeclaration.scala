package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  
  val importClause: js.UndefOr[ImportClause] = js.native
  
  @JSName("kind")
  val kind_ImportDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ImportDeclaration = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: Expression = js.native
  
  @JSName("parent")
  val parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}
