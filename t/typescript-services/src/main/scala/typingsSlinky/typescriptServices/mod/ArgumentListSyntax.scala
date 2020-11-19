package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax {
  def this(
    typeArgumentList: typingsSlinky.typescriptServices.TypeScript.TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
object ArgumentListSyntax extends js.Object {
  
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax = js.native
}
