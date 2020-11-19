package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getOriginalNode")
@js.native
object getOriginalNode extends js.Object {
  
  def apply(): js.UndefOr[Node] = js.native
  def apply(node: Node): js.UndefOr[Node] = js.native
  def apply[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[/* node */ js.UndefOr[Node], /* is T */ Boolean]
  ): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): T = js.native
}
