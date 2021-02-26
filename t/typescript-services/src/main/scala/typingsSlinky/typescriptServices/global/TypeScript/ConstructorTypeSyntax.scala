package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ITypeSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConstructorTypeSyntax")
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
object ConstructorTypeSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorTypeSyntax.create")
  @js.native
  def create(
    newKeyword: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.ConstructorTypeSyntax.create1")
  @js.native
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
}
