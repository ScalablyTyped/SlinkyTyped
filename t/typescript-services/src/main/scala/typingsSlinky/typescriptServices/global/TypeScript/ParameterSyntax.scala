package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParameterSyntax")
@js.native
class ParameterSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ParameterSyntax {
  def this(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax,
    equalsValueClause: typingsSlinky.typescriptServices.TypeScript.EqualsValueClauseSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ParameterSyntax")
@js.native
object ParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ParameterSyntax = js.native
}

