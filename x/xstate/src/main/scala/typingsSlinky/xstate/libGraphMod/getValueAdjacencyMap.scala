package typingsSlinky.xstate.libGraphMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.ValueAdjacencyMap
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getValueAdjacencyMap")
@js.native
object getValueAdjacencyMap extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent]): ValueAdjacencyMap[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], options: Partial[ValueAdjMapOptions[TContext, TEvent]]): ValueAdjacencyMap[TContext, TEvent] = js.native
}

