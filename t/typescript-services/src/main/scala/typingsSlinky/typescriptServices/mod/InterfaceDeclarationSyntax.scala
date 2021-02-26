package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "InterfaceDeclarationSyntax")
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
object InterfaceDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "InterfaceDeclarationSyntax.create")
  @js.native
  def create(
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    body: typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "InterfaceDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
}
