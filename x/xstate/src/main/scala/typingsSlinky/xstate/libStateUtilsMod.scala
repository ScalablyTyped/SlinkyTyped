package typingsSlinky.xstate

import typingsSlinky.std.Map
import typingsSlinky.xstate.libStateUtilsMod.AdjList
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.StateValue
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/stateUtils", JSImport.Namespace)
@js.native
object libStateUtilsMod extends js.Object {
  def getAdjList[TC, TE /* <: EventObject */](configuration: js.Iterable[StateNode[TC, js.Any, TE]]): AdjList[TC, TE] = js.native
  def getConfiguration[TC, TE /* <: EventObject */](prevStateNodes: js.Iterable[StateNode[TC, _, TE]], stateNodes: js.Iterable[StateNode[TC, _, TE]]): js.Iterable[StateNode[TC, _, TE]] = js.native
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, _, TE], configuration: js.Iterable[StateNode[TC, js.Any, TE]]): StateValue = js.native
  type AdjList[TC, TE /* <: EventObject */] = Map[StateNode[TC, js.Any, TE], js.Array[StateNode[TC, js.Any, TE]]]
  type Configuration[TC, TE /* <: EventObject */] = js.Iterable[StateNode[TC, js.Any, TE]]
}

