package typingsSlinky.xstate.libGraphMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.PathMap
import typingsSlinky.xstate.libTypesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getShortestPaths")
@js.native
object getShortestPaths extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent]): PathMap[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent], options: Partial[ValueAdjMapOptions[TContext, TEvent]]): PathMap[TContext, TEvent] = js.native
}

