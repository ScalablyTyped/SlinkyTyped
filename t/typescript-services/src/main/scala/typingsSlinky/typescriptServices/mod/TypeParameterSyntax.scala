package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
class TypeParameterSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeParameterSyntax {
  def this(
    identifier: ISyntaxToken,
    constraint: typingsSlinky.typescriptServices.TypeScript.ConstraintSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  def create(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.TypeParameterSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.TypeParameterSyntax = js.native
}

