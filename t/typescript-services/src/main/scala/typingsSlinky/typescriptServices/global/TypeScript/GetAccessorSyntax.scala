package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSGlobal("TypeScript.GetAccessorSyntax")
@js.native
object GetAccessorSyntax extends js.Object {
  def create(
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax
  ): typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax = js.native
  def create1(propertyName: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.GetAccessorSyntax = js.native
}

