package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExpressionStatementSyntax")
@js.native
class ExpressionStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(expression: IExpressionSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
  var expression: IExpressionSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ExpressionStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ExpressionStatementSyntax")
@js.native
object ExpressionStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): ExpressionStatementSyntax = js.native
}

