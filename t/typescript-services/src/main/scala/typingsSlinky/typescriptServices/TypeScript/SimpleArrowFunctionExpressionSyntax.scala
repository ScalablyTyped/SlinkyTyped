package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
@js.native
class SimpleArrowFunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IArrowFunctionExpressionSyntax {
  def this(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var identifier: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax = js.native
  def withBlock(block: BlockSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.SimpleArrowFunctionExpressionSyntax")
@js.native
object SimpleArrowFunctionExpressionSyntax extends js.Object {
  def create(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
  def create1(identifier: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
}

