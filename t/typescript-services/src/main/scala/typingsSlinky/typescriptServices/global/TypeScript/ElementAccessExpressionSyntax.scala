package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
class ElementAccessExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ElementAccessExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ElementAccessExpressionSyntax")
@js.native
object ElementAccessExpressionSyntax extends js.Object {
  
  def create1(expression: IExpressionSyntax, argumentExpression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
}
