package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptDashServices.TypeScript.ITypeSyntax
import typingsSlinky.typescriptDashServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.CastExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typingsSlinky.typescriptDashServices.TypeScript.CastExpressionSyntax = js.native
}

