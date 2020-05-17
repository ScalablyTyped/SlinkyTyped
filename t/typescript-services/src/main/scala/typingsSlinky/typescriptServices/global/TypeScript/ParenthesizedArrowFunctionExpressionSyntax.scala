package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax {
  def this(
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
}

