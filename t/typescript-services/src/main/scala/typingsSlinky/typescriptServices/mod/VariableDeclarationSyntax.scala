package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
class VariableDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax {
  def this(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
object VariableDeclarationSyntax extends js.Object {
  def create1(variableDeclarators: ISeparatedSyntaxList): typingsSlinky.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
}

