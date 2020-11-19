package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeParameters: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
object TypeParameterListSyntax extends js.Object {
  
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
}
