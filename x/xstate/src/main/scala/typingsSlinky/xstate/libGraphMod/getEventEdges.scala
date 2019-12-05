package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.libTypesMod.Edge
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getEventEdges")
@js.native
object getEventEdges extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], event: String): js.Array[Edge[TContext, TEvent, String]] = js.native
}

