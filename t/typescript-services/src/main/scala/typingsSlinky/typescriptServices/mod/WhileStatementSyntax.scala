package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
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
/* static members */
@JSImport("typescript-services", "WhileStatementSyntax")
@js.native
object WhileStatementSyntax extends js.Object {
  
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.WhileStatementSyntax = js.native
}
