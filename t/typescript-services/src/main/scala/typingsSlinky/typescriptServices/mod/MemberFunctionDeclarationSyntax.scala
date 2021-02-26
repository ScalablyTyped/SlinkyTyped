package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MemberFunctionDeclarationSyntax")
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
object MemberFunctionDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "MemberFunctionDeclarationSyntax.create")
  @js.native
  def create(
    propertyName: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "MemberFunctionDeclarationSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
}
