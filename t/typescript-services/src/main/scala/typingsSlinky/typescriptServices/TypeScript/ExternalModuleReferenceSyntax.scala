package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExternalModuleReferenceSyntax")
@js.native
class ExternalModuleReferenceSyntax protected ()
  extends SyntaxNode
     with IModuleReferenceSyntax {
  def this(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeParenToken: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var requireKeyword: ISyntaxToken = js.native
  var stringLiteral: ISyntaxToken = js.native
  def update(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  def withRequireKeyword(requireKeyword: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
  def withStringLiteral(stringLiteral: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ExternalModuleReferenceSyntax")
@js.native
object ExternalModuleReferenceSyntax extends js.Object {
  def create1(stringLiteral: ISyntaxToken): ExternalModuleReferenceSyntax = js.native
}

