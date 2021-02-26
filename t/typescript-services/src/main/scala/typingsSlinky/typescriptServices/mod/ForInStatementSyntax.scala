package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.IStatementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ForInStatementSyntax")
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
  @JSImport("typescript-services", "ForInStatementSyntax.create")
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
  @JSImport("typescript-services", "ForInStatementSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): typingsSlinky.typescriptServices.TypeScript.ForInStatementSyntax = js.native
}
