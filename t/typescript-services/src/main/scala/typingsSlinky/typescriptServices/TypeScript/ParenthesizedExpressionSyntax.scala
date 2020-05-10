package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedExpressionSyntax")
@js.native
class ParenthesizedExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeParenToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ParenthesizedExpressionSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ParenthesizedExpressionSyntax")
@js.native
object ParenthesizedExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): ParenthesizedExpressionSyntax = js.native
}

