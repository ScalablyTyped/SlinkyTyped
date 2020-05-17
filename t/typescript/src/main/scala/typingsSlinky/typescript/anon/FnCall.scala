package typingsSlinky.typescript.anon

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T /* <: Node */](nodes: js.UndefOr[NodeArray[T]], visitor: Visitor): NodeArray[T] = js.native
  def apply[T /* <: Node */](nodes: js.UndefOr[NodeArray[T]], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): NodeArray[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[NodeArray[T]],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double
  ): NodeArray[T] = js.native
  def apply[T /* <: Node */](
    nodes: js.UndefOr[NodeArray[T]],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, Boolean],
    start: Double,
    count: Double
  ): NodeArray[T] = js.native
}

