package typingsSlinky.xstate

import typingsSlinky.std.Partial
import typingsSlinky.xstate.libInterpreterMod.Interpreter
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.InterpreterOptions
import typingsSlinky.xstate.libTypesMod.StateMachine
import typingsSlinky.xstate.libTypesMod.StateSchema
import typingsSlinky.xstate.libTypesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Machine extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent, Typestate[TContext]]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    machine: StateMachine[TContext, TStateSchema, TEvent, Typestate[TContext]],
    options: Partial[InterpreterOptions]
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
}

