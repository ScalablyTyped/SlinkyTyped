package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    catchClause: typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax,
    finallyClause: typingsSlinky.typescriptServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object TryStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.TryStatementSyntax.create")
  @js.native
  def create(tryKeyword: ISyntaxToken, block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax): typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TryStatementSyntax.create1")
  @js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax = js.native
}
