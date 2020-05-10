package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeOfExpressionSyntax")
@js.native
class TypeOfExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
  var expression: IUnaryExpressionSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeOfExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.TypeOfExpressionSyntax")
@js.native
object TypeOfExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
}

