package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.TypeArgumentListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeArguments: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
object TypeArgumentListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.TypeArgumentListSyntax = js.native
  def create1(): typingsSlinky.typescriptDashServices.TypeScript.TypeArgumentListSyntax = js.native
}

