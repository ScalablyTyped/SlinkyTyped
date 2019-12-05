package typingsSlinky.xstate.libGraphMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.PathsMap
import typingsSlinky.xstate.libTypesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getSimplePaths")
@js.native
object getSimplePaths extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent]): PathsMap[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent], options: Partial[ValueAdjMapOptions[TContext, TEvent]]): PathsMap[TContext, TEvent] = js.native
}

