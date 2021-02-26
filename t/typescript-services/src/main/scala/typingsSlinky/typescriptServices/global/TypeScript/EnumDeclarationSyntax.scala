package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.EnumDeclarationSyntax")
@js.native
class EnumDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object EnumDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.EnumDeclarationSyntax.create")
  @js.native
  def create(
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.EnumDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
}
