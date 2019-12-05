package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptDashServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.DoStatementSyntax {
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
@JSImport("typescript-services", "DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): typingsSlinky.typescriptDashServices.TypeScript.DoStatementSyntax = js.native
}

