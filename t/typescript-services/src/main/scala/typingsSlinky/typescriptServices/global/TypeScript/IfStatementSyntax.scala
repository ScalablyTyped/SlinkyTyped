package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.IfStatementSyntax")
@js.native
class IfStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax {
  def this(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: typingsSlinky.typescriptServices.TypeScript.ElseClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object IfStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.IfStatementSyntax.create")
  @js.native
  def create(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.IfStatementSyntax.create1")
  @js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax = js.native
}
