package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object CaseSwitchClauseSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.CaseSwitchClauseSyntax.create")
  @js.native
  def create(caseKeyword: ISyntaxToken, expression: IExpressionSyntax, colonToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.CaseSwitchClauseSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
}
