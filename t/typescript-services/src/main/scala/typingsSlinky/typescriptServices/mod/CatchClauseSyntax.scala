package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CatchClauseSyntax")
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

/* static members */
@JSImport("typescript-services", "CatchClauseSyntax")
@js.native
object CatchClauseSyntax extends js.Object {
  def create(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.CatchClauseSyntax = js.native
}

