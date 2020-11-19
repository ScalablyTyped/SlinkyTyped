package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
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
/* static members */
@JSGlobal("TypeScript.EnumDeclarationSyntax")
@js.native
object EnumDeclarationSyntax extends js.Object {
  
  def create(
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
  
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
}
