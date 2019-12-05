package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getNodes")
@js.native
object getNodes extends js.Object {
  def apply(node: StateNode[_, _, OmniEventObject[EventObject]]): js.Array[StateNode[_, _, OmniEventObject[EventObject]]] = js.native
}

