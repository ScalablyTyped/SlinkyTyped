package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var functionKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  def withBlock(block: BlockSyntax): FunctionExpressionSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionExpressionSyntax = js.native
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): FunctionExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(functionKeyword: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionExpressionSyntax = js.native
  def create1(): FunctionExpressionSyntax = js.native
}

