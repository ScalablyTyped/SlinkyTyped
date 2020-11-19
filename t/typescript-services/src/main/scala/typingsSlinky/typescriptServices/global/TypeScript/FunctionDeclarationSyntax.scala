package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.FunctionDeclarationSyntax")
@js.native
object FunctionDeclarationSyntax extends js.Object {
  
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
  
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
}
