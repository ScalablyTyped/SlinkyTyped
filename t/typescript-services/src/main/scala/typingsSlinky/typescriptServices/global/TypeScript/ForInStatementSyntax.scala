package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object ForInStatementSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ForInStatementSyntax.create")
  @js.native
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ForInStatementSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax = js.native
}
