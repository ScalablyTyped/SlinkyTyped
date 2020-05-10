package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VoidExpressionSyntax")
@js.native
class VoidExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
  var expression: IUnaryExpressionSyntax = js.native
  var voidKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def withVoidKeyword(voidKeyword: ISyntaxToken): VoidExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.VoidExpressionSyntax")
@js.native
object VoidExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
}

