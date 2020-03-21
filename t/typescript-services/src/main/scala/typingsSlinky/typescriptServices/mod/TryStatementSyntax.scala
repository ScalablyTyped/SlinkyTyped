package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TryStatementSyntax")
@js.native
class TryStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax {
  def this(
    tryKeyword: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    catchClause: typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax,
    finallyClause: typingsSlinky.typescriptServices.TypeScript.FinallyClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TryStatementSyntax")
@js.native
object TryStatementSyntax extends js.Object {
  def create(tryKeyword: ISyntaxToken, block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax): typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.TryStatementSyntax = js.native
}

