package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "FunctionTypeSyntax")
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
  @JSImport("typescript-services", "FunctionTypeSyntax.create")
  @js.native
  def create(
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "FunctionTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
}
