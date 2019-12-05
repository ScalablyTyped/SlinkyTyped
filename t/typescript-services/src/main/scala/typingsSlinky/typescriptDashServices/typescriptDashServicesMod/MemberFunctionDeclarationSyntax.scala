package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
@js.native
object MemberFunctionDeclarationSyntax extends js.Object {
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}

