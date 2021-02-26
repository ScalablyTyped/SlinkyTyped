package typingsSlinky.xstate

import typingsSlinky.std.Partial
import typingsSlinky.xstate.anon.ContextValue
import typingsSlinky.xstate.anon.Value
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.MachineConfig
import typingsSlinky.xstate.typesMod.MachineOptions
import typingsSlinky.xstate.typesMod.StateMachine
import typingsSlinky.xstate.typesMod.StateSchema
import typingsSlinky.xstate.typesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineMod {
  
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, Value[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, _, TEvent],
    options: js.UndefOr[scala.Nothing],
    initialContext: TContext
  ): StateMachine[TContext, _, TEvent, Value[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, Value[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, _, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, _, TEvent, Value[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: js.UndefOr[scala.Nothing],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = js.native
  @JSImport("xstate/lib/Machine", "Machine")
  @js.native
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = js.native
  
  @JSImport("xstate/lib/Machine", "createMachine")
  @js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
  @JSImport("xstate/lib/Machine", "createMachine")
  @js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
}
