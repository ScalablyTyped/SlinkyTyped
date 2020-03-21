package typingsSlinky.xstate

import typingsSlinky.xstate.interpreterMod.Interpreter
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateMachine
import typingsSlinky.xstate.typesMod.StateSchema
import typingsSlinky.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMachineOptions extends js.Object {
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
}

