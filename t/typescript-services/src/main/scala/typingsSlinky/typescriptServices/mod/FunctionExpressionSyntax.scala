package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
}

