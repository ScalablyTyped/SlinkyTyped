package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "visitEachChild")
@js.native
object visitEachChild extends js.Object {
  
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  def apply[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): T = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.UndefOr[scala.Nothing],
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext, nodesVisitor: FnCall): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCall,
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: js.UndefOr[scala.Nothing],
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCall
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: FnCall,
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
}
