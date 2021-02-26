package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
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
object FunctionTypeSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.FunctionTypeSyntax.create")
  @js.native
  def create(
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.FunctionTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}
