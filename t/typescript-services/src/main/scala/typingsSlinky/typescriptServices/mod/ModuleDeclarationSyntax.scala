package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.INameSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ModuleDeclarationSyntax")
@js.native
class ModuleDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ModuleDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ModuleDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ModuleDeclarationSyntax.create")
  @js.native
  def create(moduleKeyword: ISyntaxToken, openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ModuleDeclarationSyntax.create1")
  @js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
}
