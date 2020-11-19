package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
}
