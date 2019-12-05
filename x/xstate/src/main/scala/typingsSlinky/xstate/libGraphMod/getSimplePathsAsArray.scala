package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.PathsItem
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getSimplePathsAsArray")
@js.native
object getSimplePathsAsArray extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](machine: StateNode[TContext, _, TEvent]): js.Array[PathsItem[TContext, TEvent]] = js.native
  def apply[TContext, TEvent /* <: EventObject */](machine: StateNode[TContext, _, TEvent], options: ValueAdjMapOptions[TContext, TEvent]): js.Array[PathsItem[TContext, TEvent]] = js.native
}

