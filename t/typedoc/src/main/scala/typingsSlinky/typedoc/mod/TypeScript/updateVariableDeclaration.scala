package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateVariableDeclaration")
@js.native
object updateVariableDeclaration extends js.Object {
  def apply(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}

