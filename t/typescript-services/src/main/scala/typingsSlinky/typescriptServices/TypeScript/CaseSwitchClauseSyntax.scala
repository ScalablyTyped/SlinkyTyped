package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends SyntaxNode
     with ISwitchClauseSyntax {
  def this(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
  var caseKeyword: ISyntaxToken = js.native
  var colonToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isSwitchClause(): Boolean = js.native
  def update(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax = js.native
  def withCaseKeyword(caseKeyword: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  def withExpression(expression: IExpressionSyntax): CaseSwitchClauseSyntax = js.native
  def withStatement(statement: IStatementSyntax): CaseSwitchClauseSyntax = js.native
  def withStatements(statements: ISyntaxList): CaseSwitchClauseSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
object CaseSwitchClauseSyntax extends js.Object {
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  def create1(expression: IExpressionSyntax): CaseSwitchClauseSyntax = js.native
}

