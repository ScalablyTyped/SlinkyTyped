package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ExternalModuleReferenceSyntax")
@js.native
class ExternalModuleReferenceSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ExternalModuleReferenceSyntax {
  def this(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ExternalModuleReferenceSyntax")
@js.native
object ExternalModuleReferenceSyntax extends js.Object {
  def create1(stringLiteral: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
}

