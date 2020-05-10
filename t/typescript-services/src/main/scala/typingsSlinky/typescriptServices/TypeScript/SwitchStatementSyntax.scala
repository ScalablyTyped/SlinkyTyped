package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var closeParenToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var openBraceToken: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var switchClauses: ISyntaxList = js.native
  var switchKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SwitchStatementSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): SwitchStatementSyntax = js.native
  def withSwitchClause(switchClause: ISwitchClauseSyntax): SwitchStatementSyntax = js.native
  def withSwitchClauses(switchClauses: ISyntaxList): SwitchStatementSyntax = js.native
  def withSwitchKeyword(switchKeyword: ISyntaxToken): SwitchStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.SwitchStatementSyntax")
@js.native
object SwitchStatementSyntax extends js.Object {
  def create(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  def create1(expression: IExpressionSyntax): SwitchStatementSyntax = js.native
}

