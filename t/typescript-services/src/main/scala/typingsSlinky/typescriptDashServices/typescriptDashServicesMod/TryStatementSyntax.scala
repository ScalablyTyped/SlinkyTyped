package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    catchClause: typingsSlinky.typescriptDashServices.TypeScript.CatchClauseSyntax,
    finallyClause: typingsSlinky.typescriptDashServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax): typingsSlinky.typescriptDashServices.TypeScript.TryStatementSyntax = js.native
  def create1(): typingsSlinky.typescriptDashServices.TypeScript.TryStatementSyntax = js.native
}

