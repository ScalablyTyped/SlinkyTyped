package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateVariableDeclaration")
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
