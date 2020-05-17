package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.IndexSignatureSyntax")
@js.native
class IndexSignatureSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax {
  def this(
    openBracketToken: ISyntaxToken,
    parameter: typingsSlinky.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.IndexSignatureSyntax")
@js.native
object IndexSignatureSyntax extends js.Object {
  def create(
    openBracketToken: ISyntaxToken,
    parameter: typingsSlinky.typescriptServices.TypeScript.ParameterSyntax,
    closeBracketToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
  def create1(parameter: typingsSlinky.typescriptServices.TypeScript.ParameterSyntax): typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
}

