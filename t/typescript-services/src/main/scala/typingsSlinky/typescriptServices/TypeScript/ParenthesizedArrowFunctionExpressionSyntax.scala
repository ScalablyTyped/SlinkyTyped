package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IArrowFunctionExpressionSyntax {
  def this(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var callSignature: CallSignatureSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withBlock(block: BlockSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ParenthesizedArrowFunctionExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(callSignature: CallSignatureSyntax, equalsGreaterThanToken: ISyntaxToken): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): ParenthesizedArrowFunctionExpressionSyntax = js.native
}

