package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
class ImportDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
object ImportDeclarationSyntax extends js.Object {
  
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
  
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
}
