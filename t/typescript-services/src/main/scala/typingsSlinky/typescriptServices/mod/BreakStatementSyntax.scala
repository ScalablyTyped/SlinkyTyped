package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
class BreakStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.BreakStatementSyntax {
  def this(
    breakKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "BreakStatementSyntax")
@js.native
object BreakStatementSyntax extends js.Object {
  
  def create(breakKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.BreakStatementSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.BreakStatementSyntax = js.native
}
