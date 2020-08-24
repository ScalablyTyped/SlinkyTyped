package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
class VoidExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.VoidExpressionSyntax {
  def this(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "VoidExpressionSyntax")
@js.native
object VoidExpressionSyntax extends js.Object {
  def create1(expression: IUnaryExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
}

