package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
class CaseSwitchClauseSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax {
  def this(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.CaseSwitchClauseSyntax")
@js.native
object CaseSwitchClauseSyntax extends js.Object {
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
  def create1(expression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
}

