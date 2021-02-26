package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "FunctionDeclarationSyntax")
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
object FunctionDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "FunctionDeclarationSyntax.create")
  @js.native
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "FunctionDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
}
