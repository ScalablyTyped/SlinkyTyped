package typingsSlinky.xstate.libInterpreterMod

import typingsSlinky.xstate.libActorMod.Actor
import typingsSlinky.xstate.libTypesMod.AnyEventObject
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.Spawnable
import typingsSlinky.xstate.libTypesMod.StateMachine
import typingsSlinky.xstate.libTypesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  def apply(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]]): Interpreter[TC, _, TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]], nameOrOptions: String): Interpreter[TC, _, TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]], nameOrOptions: SpawnOptions): Interpreter[TC, _, TE] = js.native
}

