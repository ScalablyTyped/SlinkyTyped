package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.FunctionExpressionSyntax = js.native
  def create1(): typingsSlinky.typescriptDashServices.TypeScript.FunctionExpressionSyntax = js.native
}

