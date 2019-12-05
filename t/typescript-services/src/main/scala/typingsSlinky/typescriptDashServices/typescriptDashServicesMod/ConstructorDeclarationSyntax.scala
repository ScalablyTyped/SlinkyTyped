package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ConstructorDeclarationSyntax")
@js.native
object ConstructorDeclarationSyntax extends js.Object {
  def create(
    constructorKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptDashServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax = js.native
  def create1(): typingsSlinky.typescriptDashServices.TypeScript.ConstructorDeclarationSyntax = js.native
}

