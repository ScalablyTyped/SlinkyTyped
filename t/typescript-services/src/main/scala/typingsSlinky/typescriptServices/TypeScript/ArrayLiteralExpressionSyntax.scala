package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
class ArrayLiteralExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    expressions: ISeparatedSyntaxList,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBracketToken: ISyntaxToken = js.native
  var expressions: ISeparatedSyntaxList = js.native
  var openBracketToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ArrayLiteralExpressionSyntax = js.native
  def withExpressions(expressions: ISeparatedSyntaxList): ArrayLiteralExpressionSyntax = js.native
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ArrayLiteralExpressionSyntax")
@js.native
object ArrayLiteralExpressionSyntax extends js.Object {
  def create(openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def create1(): ArrayLiteralExpressionSyntax = js.native
}

