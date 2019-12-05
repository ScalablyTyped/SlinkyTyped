package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptDashServices.TypeScript.ITypeSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
class FunctionTypeSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.FunctionTypeSyntax {
  def this(
    typeParameterList: typingsSlinky.typescriptDashServices.TypeScript.TypeParameterListSyntax,
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionTypeSyntax")
@js.native
object FunctionTypeSyntax extends js.Object {
  def create(
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.FunctionTypeSyntax = js.native
  def create1(`type`: ITypeSyntax): typingsSlinky.typescriptDashServices.TypeScript.FunctionTypeSyntax = js.native
}

