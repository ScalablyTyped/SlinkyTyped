package typingsSlinky.xstate.interpreterMod

import typingsSlinky.xstate.actorMod.Actor
import typingsSlinky.xstate.typesMod.AnyEventObject
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Spawnable
import typingsSlinky.xstate.typesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _]): Interpreter[TC, _, TE, _] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: String): Interpreter[TC, _, TE, _] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: SpawnOptions): Interpreter[TC, _, TE, _] = js.native
}
