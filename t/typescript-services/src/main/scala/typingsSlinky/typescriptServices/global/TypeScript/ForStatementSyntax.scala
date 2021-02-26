package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ForStatementSyntax")
@js.native
class ForStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ForStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object ForStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ForStatementSyntax.create")
  @js.native
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    firstSemicolonToken: ISyntaxToken,
    secondSemicolonToken: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ForStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ForStatementSyntax.create1")
  @js.native
  def create1(statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.ForStatementSyntax = js.native
}
