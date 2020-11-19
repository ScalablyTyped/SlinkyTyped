package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConditionalExpressionSyntax")
@js.native
class ConditionalExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ConditionalExpressionSyntax {
  def this(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ConditionalExpressionSyntax")
@js.native
object ConditionalExpressionSyntax extends js.Object {
  
  def create1(condition: IExpressionSyntax, whenTrue: IExpressionSyntax, whenFalse: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
}
