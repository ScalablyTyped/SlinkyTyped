package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
class TypeAnnotationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax {
  def this(colonToken: ISyntaxToken, `type`: ITypeSyntax, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSGlobal("TypeScript.TypeAnnotationSyntax")
@js.native
object TypeAnnotationSyntax extends js.Object {
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
}

