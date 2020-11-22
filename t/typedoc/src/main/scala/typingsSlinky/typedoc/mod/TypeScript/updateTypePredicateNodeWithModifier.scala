package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AssertsKeyword
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ThisTypeNode
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateTypePredicateNodeWithModifier")
@js.native
object updateTypePredicateNodeWithModifier extends js.Object {
  
  def apply(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[scala.Nothing],
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def apply(node: TypePredicateNode, assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: js.UndefOr[scala.Nothing],
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  /** @deprecated Use `factory.updateTypePredicateNode` or the factory supplied by your transformation context instead. */
  def apply(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def apply(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
}
