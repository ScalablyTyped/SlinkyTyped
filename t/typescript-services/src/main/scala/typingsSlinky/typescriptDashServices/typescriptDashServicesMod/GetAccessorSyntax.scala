package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
class GetAccessorSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.GetAccessorSyntax {
  def this(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    typeAnnotation: typingsSlinky.typescriptDashServices.TypeScript.TypeAnnotationSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "GetAccessorSyntax")
@js.native
object GetAccessorSyntax extends js.Object {
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptDashServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptDashServices.TypeScript.GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.GetAccessorSyntax = js.native
}

