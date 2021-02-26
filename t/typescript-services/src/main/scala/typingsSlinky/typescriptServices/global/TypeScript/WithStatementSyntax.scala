package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.WithStatementSyntax")
@js.native
class WithStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax {
  def this(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object WithStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.WithStatementSyntax.create1")
  @js.native
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.WithStatementSyntax = js.native
}
