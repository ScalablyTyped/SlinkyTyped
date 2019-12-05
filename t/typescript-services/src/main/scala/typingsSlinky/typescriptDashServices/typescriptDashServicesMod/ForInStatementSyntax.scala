package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptDashServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.ForInStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typingsSlinky.typescriptDashServices.TypeScript.VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ForInStatementSyntax")
@js.native
object ForInStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.ForInStatementSyntax = js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptDashServices.TypeScript.ForInStatementSyntax = js.native
}

