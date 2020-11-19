package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.ConstructorDeclarationSyntax")
@js.native
object ConstructorDeclarationSyntax extends js.Object {
  
  def create(
    constructorKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
}
