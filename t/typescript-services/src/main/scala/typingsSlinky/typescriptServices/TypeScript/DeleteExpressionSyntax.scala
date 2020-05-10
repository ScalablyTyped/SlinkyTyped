package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DeleteExpressionSyntax")
@js.native
class DeleteExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
  var deleteKeyword: ISyntaxToken = js.native
  var expression: IUnaryExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
  def withDeleteKeyword(deleteKeyword: ISyntaxToken): DeleteExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.DeleteExpressionSyntax")
@js.native
object DeleteExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
}

