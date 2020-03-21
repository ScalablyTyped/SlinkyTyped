package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectTypeSyntax")
@js.native
class ObjectTypeSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    typeMembers: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ObjectTypeSyntax")
@js.native
object ObjectTypeSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
}

