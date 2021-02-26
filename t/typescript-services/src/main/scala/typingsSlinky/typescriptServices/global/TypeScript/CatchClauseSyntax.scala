package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CatchClauseSyntax")
@js.native
class CatchClauseSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax {
  def this(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object CatchClauseSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.CatchClauseSyntax.create")
  @js.native
  def create(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.CatchClauseSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax = js.native
}
