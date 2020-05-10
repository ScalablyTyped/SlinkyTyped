package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends SyntaxNode
     with IUnaryExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var expression: IUnaryExpressionSyntax = js.native
  var greaterThanToken: ISyntaxToken = js.native
  var lessThanToken: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): CastExpressionSyntax = js.native
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): CastExpressionSyntax = js.native
  def withLessThanToken(lessThanToken: ISyntaxToken): CastExpressionSyntax = js.native
  def withType(`type`: ITypeSyntax): CastExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): CastExpressionSyntax = js.native
}

