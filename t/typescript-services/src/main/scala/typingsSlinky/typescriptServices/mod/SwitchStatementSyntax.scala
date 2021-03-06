package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SwitchStatementSyntax")
@js.native
class SwitchStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SwitchStatementSyntax {
  def this(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object SwitchStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "SwitchStatementSyntax.create")
  @js.native
  def create(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "SwitchStatementSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
}
