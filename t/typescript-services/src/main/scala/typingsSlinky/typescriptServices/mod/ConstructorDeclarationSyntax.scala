package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ConstructorDeclarationSyntax")
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
object ConstructorDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ConstructorDeclarationSyntax.create")
  @js.native
  def create(
    constructorKeyword: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "ConstructorDeclarationSyntax.create1")
  @js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
}
