package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  
  def create(
    variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
  
  def create1(variableDeclarator: typingsSlinky.typescriptServices.TypeScript.VariableDeclaratorSyntax): typingsSlinky.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
}
