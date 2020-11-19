package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import typingsSlinky.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
class CastExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.CastExpressionSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.CastExpressionSyntax")
@js.native
object CastExpressionSyntax extends js.Object {
  
  def create1(`type`: ITypeSyntax, expression: IUnaryExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.CastExpressionSyntax = js.native
}
