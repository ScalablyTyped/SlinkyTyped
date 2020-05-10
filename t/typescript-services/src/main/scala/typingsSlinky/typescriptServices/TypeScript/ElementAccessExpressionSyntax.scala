package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
class ElementAccessExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var argumentExpression: IExpressionSyntax = js.native
  var closeBracketToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var openBracketToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax = js.native
  def withArgumentExpression(argumentExpression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
object ElementAccessExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax, argumentExpression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
}

