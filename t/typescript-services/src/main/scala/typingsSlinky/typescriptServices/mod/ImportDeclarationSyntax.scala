package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ImportDeclarationSyntax")
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
object ImportDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ImportDeclarationSyntax.create")
  @js.native
  def create(
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ImportDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken, moduleReference: IModuleReferenceSyntax): typingsSlinky.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
}
