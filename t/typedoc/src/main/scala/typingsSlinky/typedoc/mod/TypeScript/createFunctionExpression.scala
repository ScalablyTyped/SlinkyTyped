package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AsteriskToken
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.FunctionExpression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createFunctionExpression")
@js.native
object createFunctionExpression extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[ParameterDeclaration]],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
}

