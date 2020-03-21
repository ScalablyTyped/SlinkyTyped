package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ThrowStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
object ThrowStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
}

