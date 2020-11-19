package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "IfStatementSyntax")
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
/* static members */
@JSImport("typescript-services", "IfStatementSyntax")
@js.native
object IfStatementSyntax extends js.Object {
  
  def create(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax = js.native
  
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.IfStatementSyntax = js.native
}
