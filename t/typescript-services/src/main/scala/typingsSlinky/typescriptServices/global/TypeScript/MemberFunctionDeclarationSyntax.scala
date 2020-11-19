package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.MemberFunctionDeclarationSyntax")
@js.native
object MemberFunctionDeclarationSyntax extends js.Object {
  
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}
