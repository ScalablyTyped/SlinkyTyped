package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.WithStatementSyntax")
@js.native
class WithStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax {
  def this(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.WithStatementSyntax")
@js.native
object WithStatementSyntax extends js.Object {
  
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax = js.native
}
