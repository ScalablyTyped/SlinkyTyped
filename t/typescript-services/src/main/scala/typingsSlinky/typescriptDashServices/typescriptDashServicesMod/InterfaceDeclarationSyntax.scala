package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
class InterfaceDeclarationSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typingsSlinky.typescriptDashServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: typingsSlinky.typescriptDashServices.TypeScript.ObjectTypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "InterfaceDeclarationSyntax")
@js.native
object InterfaceDeclarationSyntax extends js.Object {
  def create(
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    body: typingsSlinky.typescriptDashServices.TypeScript.ObjectTypeSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.InterfaceDeclarationSyntax = js.native
}

