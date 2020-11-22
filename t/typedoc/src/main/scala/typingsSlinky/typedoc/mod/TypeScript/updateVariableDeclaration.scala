package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.ExclamationToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateVariableDeclaration")
@js.native
object updateVariableDeclaration extends js.Object {
  
  /** @deprecated Use `factory.updateVariableDeclaration` or the factory supplied by your transformation context instead. */
  def apply(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: ExclamationToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(
    node: VariableDeclaration,
    name: BindingName,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def apply(node: VariableDeclaration, name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
}
