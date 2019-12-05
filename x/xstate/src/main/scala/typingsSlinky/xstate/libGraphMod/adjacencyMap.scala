package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.libTypesMod.AdjacencyMap
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "adjacencyMap")
@js.native
object adjacencyMap extends js.Object {
  def apply[TContext](node: StateNode[TContext, _, OmniEventObject[EventObject]]): AdjacencyMap = js.native
  def apply[TContext](node: StateNode[TContext, _, OmniEventObject[EventObject]], context: TContext): AdjacencyMap = js.native
}

