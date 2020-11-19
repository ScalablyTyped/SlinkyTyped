package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ClassDeclarationSyntax")
@js.native
class ClassDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ClassDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ClassDeclarationSyntax")
@js.native
object ClassDeclarationSyntax extends js.Object {
  
  def create(
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
  
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
}
