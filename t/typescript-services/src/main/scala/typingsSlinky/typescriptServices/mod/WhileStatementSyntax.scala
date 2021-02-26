package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.WhileStatementSyntax {
  def this(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object WhileStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "WhileStatementSyntax.create1")
  @js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.WhileStatementSyntax = js.native
}
