package typingsSlinky.xstate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.xstate.libActorMod.Actor
import typingsSlinky.xstate.libInterpreterMod.SpawnOptions
import typingsSlinky.xstate.libInterpreterMod.Spawnable
import typingsSlinky.xstate.libMatchMod.StatePatternTuple
import typingsSlinky.xstate.libMatchMod.ValueFromStateGetter
import typingsSlinky.xstate.libTypesMod.ActivityActionObject
import typingsSlinky.xstate.libTypesMod.ActivityDefinition
import typingsSlinky.xstate.libTypesMod.AssignAction
import typingsSlinky.xstate.libTypesMod.Assigner
import typingsSlinky.xstate.libTypesMod.CancelAction
import typingsSlinky.xstate.libTypesMod.DoneEventObject
import typingsSlinky.xstate.libTypesMod.Event
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.InterpreterOptions
import typingsSlinky.xstate.libTypesMod.MachineConfig
import typingsSlinky.xstate.libTypesMod.MachineOptions
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.libTypesMod.RaiseEvent
import typingsSlinky.xstate.libTypesMod.SendAction
import typingsSlinky.xstate.libTypesMod.SendActionOptions
import typingsSlinky.xstate.libTypesMod.SendExpr
import typingsSlinky.xstate.libTypesMod.StateConfig
import typingsSlinky.xstate.libTypesMod.StateMachine
import typingsSlinky.xstate.libTypesMod.StateNodeConfig
import typingsSlinky.xstate.libTypesMod.StateSchema
import typingsSlinky.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", JSImport.Namespace)
@js.native
object xstateMod extends js.Object {
  @js.native
  class Interpreter[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] protected ()
    extends typingsSlinky.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] {
    /**
      * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
      *
      * @param machine The machine to be interpreted
      * @param options Interpreter options
      */
    def this(machine: StateMachine[TContext, TStateSchema, TEvent]) = this()
    def this(machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]) = this()
  }
  
  @js.native
  class State[TContext, TEvent /* <: EventObject */] protected ()
    extends typingsSlinky.xstate.libStateMod.State[TContext, TEvent] {
    /**
      * Creates a new State instance.
      * @param value The state value
      * @param context The extended state
      * @param historyValue The tree representing historical values of the state nodes
      * @param history The previous state
      * @param actions An array of action objects to execute as side-effects
      * @param activities A mapping of activities and whether they are started (`true`) or stopped (`false`).
      * @param meta
      * @param events Internal event queue. Should be empty with run-to-completion semantics.
      * @param tree
      */
    def this(config: StateConfig[TContext, TEvent]) = this()
  }
  
  @js.native
  class StateNode[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: OmniEventObject[EventObject] */] protected ()
    extends typingsSlinky.xstate.libStateNodeMod.StateNode[TContext, TStateSchema, TEvent] {
    def this(_config: StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
    def this(
      _config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]]
    ) = this()
    def this(
      _config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]],
      /**
      * The initial extended state
      */
    context: TContext
    ) = this()
  }
  
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](
    assignment: Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ typingsSlinky.xstate.xstateStrings.assign with js.Any
    ]
  ): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typingsSlinky.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typingsSlinky.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typingsSlinky.xstate.libStateMod.State[TContext, TEvent],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def spawn[TContext](entity: Spawnable[TContext]): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: String): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: SpawnOptions): Actor[TContext, EventObject] = js.native
  @js.native
  object ActionTypes extends js.Object {
    /* "xstate.after" */ val After: typingsSlinky.xstate.libTypesMod.ActionTypes.After with String = js.native
    /* "xstate.assign" */ val Assign: typingsSlinky.xstate.libTypesMod.ActionTypes.Assign with String = js.native
    /* "xstate.cancel" */ val Cancel: typingsSlinky.xstate.libTypesMod.ActionTypes.Cancel with String = js.native
    /* "done.invoke" */ val DoneInvoke: typingsSlinky.xstate.libTypesMod.ActionTypes.DoneInvoke with String = js.native
    /* "done.state" */ val DoneState: typingsSlinky.xstate.libTypesMod.ActionTypes.DoneState with String = js.native
    /* "error.communication" */ val ErrorCommunication: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorCommunication with String = js.native
    /* "error.execution" */ val ErrorExecution: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorExecution with String = js.native
    /* "error.platform" */ val ErrorPlatform: typingsSlinky.xstate.libTypesMod.ActionTypes.ErrorPlatform with String = js.native
    /* "xstate.init" */ val Init: typingsSlinky.xstate.libTypesMod.ActionTypes.Init with String = js.native
    /* "xstate.invoke" */ val Invoke: typingsSlinky.xstate.libTypesMod.ActionTypes.Invoke with String = js.native
    /* "xstate.log" */ val Log: typingsSlinky.xstate.libTypesMod.ActionTypes.Log with String = js.native
    /* "" */ val NullEvent: typingsSlinky.xstate.libTypesMod.ActionTypes.NullEvent with String = js.native
    /* "xstate.pure" */ val Pure: typingsSlinky.xstate.libTypesMod.ActionTypes.Pure with String = js.native
    /* "xstate.raise" */ val Raise: typingsSlinky.xstate.libTypesMod.ActionTypes.Raise with String = js.native
    /* "xstate.send" */ val Send: typingsSlinky.xstate.libTypesMod.ActionTypes.Send with String = js.native
    /* "xstate.start" */ val Start: typingsSlinky.xstate.libTypesMod.ActionTypes.Start with String = js.native
    /* "xstate.stop" */ val Stop: typingsSlinky.xstate.libTypesMod.ActionTypes.Stop with String = js.native
    /* "xstate.update" */ val Update: typingsSlinky.xstate.libTypesMod.ActionTypes.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.xstate.libTypesMod.ActionTypes with String] = js.native
  }
  
  /* static members */
  @js.native
  object Interpreter extends js.Object {
    /**
      * The default interpreter options:
      *
      * - `clock` uses the global `setTimeout` and `clearTimeout` functions
      * - `logger` uses the global `console.log()` method
      */
    var defaultOptions: InterpreterOptions = js.native
    @JSName("interpret")
    var interpret_Original: Fn_Machine = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typingsSlinky.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typingsSlinky.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  }
  
  @js.native
  object SpecialTargets extends js.Object {
    /* "#_internal" */ val Internal: typingsSlinky.xstate.libTypesMod.SpecialTargets.Internal with String = js.native
    /* "#_parent" */ val Parent: typingsSlinky.xstate.libTypesMod.SpecialTargets.Parent with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.xstate.libTypesMod.SpecialTargets with String] = js.native
  }
  
  /* static members */
  @js.native
  object State extends js.Object {
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    def from[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.libStateMod.State[TC, TE]): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.libStateMod.State[TC, TE], context: TC): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    def inert[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.libStateMod.State[TC, EventObject], context: TC): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
    def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typingsSlinky.xstate.libStateMod.State[TC, TE] = js.native
  }
  
  @js.native
  object actions extends js.Object {
    @JSName("after")
    var after_Original: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
    @JSName("done")
    var done_Original: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
    @JSName("log")
    var log_Original: Fn_Ctx = js.native
    @JSName("raise")
    var raise_Original: Fn_Event = js.native
    @JSName("sendParent")
    var sendParent_Original: Fn_EventOptions = js.native
    @JSName("send")
    var send_Original: Fn_EventOptions = js.native
    @JSName("start")
    var start_Original: Fn_Activity = js.native
    @JSName("stop")
    var stop_Original: Fn_Activity = js.native
    def after(delayRef: String): String = js.native
    def after(delayRef: String, id: String): String = js.native
    def after(delayRef: Double): String = js.native
    def after(delayRef: Double, id: String): String = js.native
    def assign[TContext, TEvent /* <: EventObject */](
      assignment: Partial[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
      */ typingsSlinky.xstate.xstateStrings.actions with js.Any
        ]
    ): AssignAction[TContext, TEvent] = js.native
    def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
    def cancel(sendId: String): CancelAction = js.native
    def cancel(sendId: Double): CancelAction = js.native
    def done(id: String): DoneEventObject = js.native
    def done(id: String, data: js.Any): DoneEventObject = js.native
    def log[TContext, TEvent /* <: EventObject */](): Anon_Ctx[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _]): Anon_Ctx[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: js.Function2[/* ctx */ TContext, /* event */ TEvent, _], label: String): Anon_Ctx[TContext, TEvent] = js.native
    def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseEvent[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  }
  
}

