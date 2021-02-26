package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typingsSlinky.typescriptServices.TypeScript.TypeAnnotationSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object GetAccessorSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.GetAccessorSyntax.create")
  @js.native
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.GetAccessorSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax = js.native
}
