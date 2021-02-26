package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ConditionalExpressionSyntax")
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
object ConditionalExpressionSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ConditionalExpressionSyntax.create1")
  @js.native
  def create1(condition: IExpressionSyntax, whenTrue: IExpressionSyntax, whenFalse: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
}
