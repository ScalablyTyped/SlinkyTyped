package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  var closeParenToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var switchClauses: ISyntaxList = js.native
  
  var switchKeyword: ISyntaxToken = js.native
  
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
