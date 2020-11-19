package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
class ConstructorTypeSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax {
  def this(
    newKeyword: ISyntaxToken,
    typeParameterList: typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "ConstructorTypeSyntax")
@js.native
object ConstructorTypeSyntax extends js.Object {
  
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
  
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
}
