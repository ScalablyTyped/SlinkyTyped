package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object SetAccessorSyntax {
  
  /* static member */
  @JSImport("typescript-services", "SetAccessorSyntax.create")
  @js.native
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.SetAccessorSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "SetAccessorSyntax.create1")
  @js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.SetAccessorSyntax = js.native
}
