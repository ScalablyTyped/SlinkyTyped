package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReturnStatementSyntax")
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
@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
}

