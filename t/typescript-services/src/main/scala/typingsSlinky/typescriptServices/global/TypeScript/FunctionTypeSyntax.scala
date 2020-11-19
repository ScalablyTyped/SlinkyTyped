package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typingsSlinky.typescriptServices.TypeScript.TypeParameterListSyntax,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  
  def create(
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}
