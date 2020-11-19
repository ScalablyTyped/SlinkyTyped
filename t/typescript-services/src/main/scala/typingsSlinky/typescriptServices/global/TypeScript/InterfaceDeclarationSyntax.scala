package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.InterfaceDeclarationSyntax")
@js.native
object InterfaceDeclarationSyntax extends js.Object {
  
  def create(
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    body: typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
  
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
}
