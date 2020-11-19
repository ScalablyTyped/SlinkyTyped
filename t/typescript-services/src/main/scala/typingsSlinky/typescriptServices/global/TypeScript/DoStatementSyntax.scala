package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.DoStatementSyntax {
  def this(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.DoStatementSyntax = js.native
}
