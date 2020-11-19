package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
class ContinueStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ContinueStatementSyntax {
  def this(
    continueKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ContinueStatementSyntax")
@js.native
object ContinueStatementSyntax extends js.Object {
  
  def create(continueKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
}
