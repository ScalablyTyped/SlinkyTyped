package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
class SetAccessorSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.SetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SetAccessorSyntax")
@js.native
object SetAccessorSyntax extends js.Object {
  def create(
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.SetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.SetAccessorSyntax = js.native
}

