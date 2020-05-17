package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedExpressionSyntax")
@js.native
class ParenthesizedExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ParenthesizedExpressionSyntax {
  def this(
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ParenthesizedExpressionSyntax")
@js.native
object ParenthesizedExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
}

