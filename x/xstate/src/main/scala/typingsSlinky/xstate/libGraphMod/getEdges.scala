package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.Anon_Depth
import typingsSlinky.xstate.libTypesMod.Edge
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getEdges")
@js.native
object getEdges extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent]): js.Array[Edge[TContext, TEvent, String]] = js.native
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], options: Anon_Depth): js.Array[Edge[TContext, TEvent, String]] = js.native
}

