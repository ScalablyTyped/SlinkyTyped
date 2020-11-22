package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.visitNode")
@js.native
object visitNode extends js.Object {
  
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  def apply[T /* <: Node */](): js.UndefOr[T] = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  def apply[T /* <: Node */](node: T): T = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](node: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, Boolean]): T = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](node: T, visitor: Visitor): T = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](node: T, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): T = js.native
  def apply[T /* <: Node */](
    node: T,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.UndefOr[scala.Nothing],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
}
