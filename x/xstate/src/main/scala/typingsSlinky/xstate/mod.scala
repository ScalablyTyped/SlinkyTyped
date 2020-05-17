package typingsSlinky.xstate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.xstate.actorMod.Actor
import typingsSlinky.xstate.anon.Fn0
import typingsSlinky.xstate.anon.Fn1
import typingsSlinky.xstate.anon.FnCall
import typingsSlinky.xstate.anon.FnCallActivity
import typingsSlinky.xstate.anon.FnCallErrorDataOptions
import typingsSlinky.xstate.anon.FnCallEventOptions
import typingsSlinky.xstate.anon.FnCallExprLabel
import typingsSlinky.xstate.anon.FnCallMachineOptions
import typingsSlinky.xstate.anon.FnCallTargetOptions
import typingsSlinky.xstate.anon.PartialInterpreterOptions
import typingsSlinky.xstate.interpreterMod.SpawnOptions
import typingsSlinky.xstate.matchMod.StatePatternTuple
import typingsSlinky.xstate.matchMod.ValueFromStateGetter
import typingsSlinky.xstate.typesMod.ActivityActionObject
import typingsSlinky.xstate.typesMod.ActivityDefinition
import typingsSlinky.xstate.typesMod.AnyEventObject
import typingsSlinky.xstate.typesMod.AssignAction
import typingsSlinky.xstate.typesMod.Assigner
import typingsSlinky.xstate.typesMod.CancelAction
import typingsSlinky.xstate.typesMod.DoneEvent
import typingsSlinky.xstate.typesMod.DoneEventObject
import typingsSlinky.xstate.typesMod.Event
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.ExprWithMeta
import typingsSlinky.xstate.typesMod.InterpreterOptions
import typingsSlinky.xstate.typesMod.LogAction
import typingsSlinky.xstate.typesMod.LogExpr
import typingsSlinky.xstate.typesMod.MachineConfig
import typingsSlinky.xstate.typesMod.MachineOptions
import typingsSlinky.xstate.typesMod.PropertyAssigner
import typingsSlinky.xstate.typesMod.RaiseAction
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionOptions
import typingsSlinky.xstate.typesMod.SendExpr
import typingsSlinky.xstate.typesMod.Spawnable
import typingsSlinky.xstate.typesMod.StateConfig
import typingsSlinky.xstate.typesMod.StateMachine
import typingsSlinky.xstate.typesMod.StateNodeConfig
import typingsSlinky.xstate.typesMod.StateSchema
import typingsSlinky.xstate.typesMod.StateValue
import typingsSlinky.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Interpreter[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typingsSlinky.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] {
    /**
      * Creates a new Interpreter instance (i.e., service) for the given machine with the provided options, if any.
      *
      * @param machine The machine to be interpreted
      * @param options Interpreter options
      */
    def this(machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]) = this()
    def this(
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
    ) = this()
  }
  
  @js.native
  class State[TContext, TEvent /* <: EventObject */, TStateSchema /* <: StateSchema[TContext] */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typingsSlinky.xstate.stateMod.State[TContext, TEvent, TStateSchema, TTypestate] {
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
      * @param configuration
      */
    def this(config: StateConfig[TContext, TEvent]) = this()
  }
  
  @js.native
  class StateNode[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected ()
    extends typingsSlinky.xstate.stateNodeMod.StateNode[TContext, TStateSchema, TEvent, TTypestate] {
    def this(/**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent]) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]]
    ) = this()
    def this(
      /**
      * The raw config used to create the machine.
      */
    config: StateNodeConfig[TContext, TStateSchema, TEvent],
      options: Partial[MachineOptions[TContext, TEvent]],
      /**
      * The initial extended state
      */
    context: TContext
    ) = this()
  }
  
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, _] = js.native
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, _] = js.native
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, _, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, _, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  @JSName("Machine")
  def Machine_TContextTStateSchema_StateSchemaWildcardTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, _] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, _, TEvent], options: Partial[MachineOptions[TContext, TEvent]]): StateMachine[TContext, _, TEvent, TTypestate] = js.native
  def doneInvoke(id: String): DoneEvent = js.native
  def doneInvoke(id: String, data: js.Any): DoneEvent = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent] = js.native
  @JSName("forwardTo")
  def forwardTo_to[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typingsSlinky.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
    options: PartialInterpreterOptions
  ): typingsSlinky.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typingsSlinky.xstate.stateMod.State[TContext, TEvent, _, _],
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
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[_]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
  def spawn(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def spawn(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _]): typingsSlinky.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: String): typingsSlinky.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  def spawn[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: SpawnOptions): typingsSlinky.xstate.interpreterMod.Interpreter[TC, _, TE, _] = js.native
  @js.native
  object ActionTypes extends js.Object {
    /* "xstate.after" */ val After: typingsSlinky.xstate.typesMod.ActionTypes.After with String = js.native
    /* "xstate.assign" */ val Assign: typingsSlinky.xstate.typesMod.ActionTypes.Assign with String = js.native
    /* "xstate.cancel" */ val Cancel: typingsSlinky.xstate.typesMod.ActionTypes.Cancel with String = js.native
    /* "done.invoke" */ val DoneInvoke: typingsSlinky.xstate.typesMod.ActionTypes.DoneInvoke with String = js.native
    /* "done.state" */ val DoneState: typingsSlinky.xstate.typesMod.ActionTypes.DoneState with String = js.native
    /* "error.communication" */ val ErrorCommunication: typingsSlinky.xstate.typesMod.ActionTypes.ErrorCommunication with String = js.native
    /* "xstate.error" */ val ErrorCustom: typingsSlinky.xstate.typesMod.ActionTypes.ErrorCustom with String = js.native
    /* "error.execution" */ val ErrorExecution: typingsSlinky.xstate.typesMod.ActionTypes.ErrorExecution with String = js.native
    /* "error.platform" */ val ErrorPlatform: typingsSlinky.xstate.typesMod.ActionTypes.ErrorPlatform with String = js.native
    /* "xstate.init" */ val Init: typingsSlinky.xstate.typesMod.ActionTypes.Init with String = js.native
    /* "xstate.invoke" */ val Invoke: typingsSlinky.xstate.typesMod.ActionTypes.Invoke with String = js.native
    /* "xstate.log" */ val Log: typingsSlinky.xstate.typesMod.ActionTypes.Log with String = js.native
    /* "" */ val NullEvent: typingsSlinky.xstate.typesMod.ActionTypes.NullEvent with String = js.native
    /* "xstate.pure" */ val Pure: typingsSlinky.xstate.typesMod.ActionTypes.Pure with String = js.native
    /* "xstate.raise" */ val Raise: typingsSlinky.xstate.typesMod.ActionTypes.Raise with String = js.native
    /* "xstate.send" */ val Send: typingsSlinky.xstate.typesMod.ActionTypes.Send with String = js.native
    /* "xstate.start" */ val Start: typingsSlinky.xstate.typesMod.ActionTypes.Start with String = js.native
    /* "xstate.stop" */ val Stop: typingsSlinky.xstate.typesMod.ActionTypes.Stop with String = js.native
    /* "xstate.update" */ val Update: typingsSlinky.xstate.typesMod.ActionTypes.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.xstate.typesMod.ActionTypes with String] = js.native
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
    var interpret_Original: FnCallMachineOptions = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate]): typingsSlinky.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
    def interpret[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
      machine: StateMachine[TContext, TStateSchema, TEvent, TTypestate],
      options: PartialInterpreterOptions
    ): typingsSlinky.xstate.interpreterMod.Interpreter[TContext, TStateSchema, TEvent, TTypestate] = js.native
  }
  
  @js.native
  object SpecialTargets extends js.Object {
    /* "#_internal" */ val Internal: typingsSlinky.xstate.typesMod.SpecialTargets.Internal with String = js.native
    /* "#_parent" */ val Parent: typingsSlinky.xstate.typesMod.SpecialTargets.Parent with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.xstate.typesMod.SpecialTargets with String] = js.native
  }
  
  /* static members */
  @js.native
  object State extends js.Object {
    /**
      * Creates a new State instance for the given `config`.
      * @param config The state config
      */
    def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    /**
      * Creates a new State instance for the given `stateValue` and `context`.
      * @param stateValue
      * @param context
      */
    def from[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.stateMod.State[TC, TE, _, _]): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.stateMod.State[TC, TE, _, _], context: TC): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    /**
      * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
      * @param stateValue
      * @param context
      */
    def inert[TC, TE /* <: EventObject */](stateValue: typingsSlinky.xstate.stateMod.State[TC, TE, _, _], context: TC): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
    def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typingsSlinky.xstate.stateMod.State[TC, TE, _, _] = js.native
  }
  
  @js.native
  object actions extends js.Object {
    @JSName("after")
    var after_Original: js.Function2[/* delayRef */ Double | String, /* id */ js.UndefOr[String], String] = js.native
    @JSName("done")
    var done_Original: js.Function2[/* id */ String, /* data */ js.UndefOr[js.Any], DoneEventObject] = js.native
    @JSName("escalate")
    var escalate_Original: FnCallErrorDataOptions = js.native
    @JSName("forwardTo")
    var forwardTo_Original: FnCallTargetOptions = js.native
    @JSName("log")
    var log_Original: FnCallExprLabel = js.native
    @JSName("raise")
    var raise_Original: FnCall = js.native
    @JSName("respond")
    var respond_Original: FnCallEventOptions = js.native
    @JSName("sendParent")
    var sendParent_Original: Fn0 = js.native
    @JSName("sendUpdate")
    var sendUpdate_Original: Fn1 = js.native
    @JSName("send")
    var send_Original: FnCallEventOptions = js.native
    @JSName("start")
    var start_Original: FnCallActivity = js.native
    @JSName("stop")
    var stop_Original: FnCallActivity = js.native
    def after(delayRef: String): String = js.native
    def after(delayRef: String, id: String): String = js.native
    def after(delayRef: Double): String = js.native
    def after(delayRef: Double, id: String): String = js.native
    def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
    def assign[TContext, TEvent /* <: EventObject */](assignment: PropertyAssigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
    def cancel(sendId: String): CancelAction = js.native
    def cancel(sendId: Double): CancelAction = js.native
    def done(id: String): DoneEventObject = js.native
    def done(id: String, data: js.Any): DoneEventObject = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent] = js.native
    def escalate[TContext, TEvent /* <: EventObject */, TErrorData](
      errorData: ExprWithMeta[TContext, TEvent, TErrorData],
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent] = js.native
    @JSName("forwardTo")
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
    ): SendAction[TContext, TEvent] = js.native
    @JSName("forwardTo")
    def forwardTo_to[TContext, TEvent /* <: EventObject */](
      target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
      options: SendActionOptions[TContext, TEvent]
    ): SendAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
    def log[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
    def raise[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
    def respond[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
    def respond[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def respond[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: Event[_]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
    def sendUpdate[TContext, TEvent /* <: EventObject */](): SendAction[TContext, TEvent] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def start[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: String): ActivityActionObject[TContext, TEvent] = js.native
    def stop[TContext, TEvent /* <: EventObject */](activity: ActivityDefinition[TContext, TEvent]): ActivityActionObject[TContext, TEvent] = js.native
  }
  
}

