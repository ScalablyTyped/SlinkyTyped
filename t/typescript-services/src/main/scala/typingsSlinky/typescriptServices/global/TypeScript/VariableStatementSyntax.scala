package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.VariableStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  
  def create(
    variableDeclaration: typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.VariableStatementSyntax = js.native
  
  def create1(variableDeclaration: typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax): typingsSlinky.typescriptServices.TypeScript.VariableStatementSyntax = js.native
}
