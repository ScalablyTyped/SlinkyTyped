package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.ContextAny
import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.anon.`0`
import typingsSlinky.xstate.anon.`1`
import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.`final`
import typingsSlinky.xstate.xstateStrings.atomic
import typingsSlinky.xstate.xstateStrings.compound
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.history
import typingsSlinky.xstate.xstateStrings.parallel
import typingsSlinky.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] {
  
  /**
    * The activities to be started upon entering the state node,
    * and stopped upon exiting the state node.
    */
  var activities: js.UndefOr[SingleOrArray[Activity[TContext, TEvent]]] = js.native
  
  /**
    * The mapping (or array) of delays (in milliseconds) to their potential transition(s).
    * The delayed transitions are taken after the specified delay in an interpreter.
    */
  var after: js.UndefOr[DelayedTransitions[TContext, TEvent]] = js.native
  
  /**
    * An eventless transition that is always taken when this state node is active.
    * Equivalent to a transition specified as an empty `''`' string in the `on` property.
    */
  var always: js.UndefOr[TransitionConfigOrTarget[TContext, TEvent]] = js.native
  
  /**
    * The initial context (extended state) of the machine.
    *
    * Can be an object or a function that returns an object.
    */
  var context: js.UndefOr[TContext | js.Function0[TContext]] = js.native
  
  /**
    * The data sent with the "done.state._id_" event if this is a final state node.
    *
    * The data will be evaluated with the current `context` and placed on the `.data` property
    * of the event.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
  
  /**
    * The string delimiter for serializing the path to a string. The default is "."
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * The action(s) to be executed upon entering the state node.
    */
  var entry: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The action(s) to be executed upon exiting the state node.
    */
  var exit: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * Indicates whether the state node is a history state node, and what
    * type of history:
    * shallow, deep, true (shallow), false (none), undefined (none)
    */
  var history: js.UndefOr[shallow | deep | Boolean] = js.native
  
  /**
    * The unique ID of the state node, which can be referenced as a transition target via the
    * `#id` syntax.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The initial state node key.
    */
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  
  /**
    * The services to invoke upon entering this state node. These services will be stopped upon exiting this state node.
    */
  var invoke: js.UndefOr[
    SingleOrArray[(InvokeConfig[TContext, TEvent]) | (StateMachine[_, _, _, ContextAny])]
  ] = js.native
  
  /**
    * The relative key of the state node, which represents its location in the overall state value.
    * This is automatically determined by the configuration shape via the key where it was defined.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The meta data associated with this state node, which will be returned in State instances.
    */
  var meta: js.UndefOr[js.Any] = js.native
  
  /**
    * The mapping of event types to their potential transition(s).
    */
  var on: js.UndefOr[TransitionsConfig[TContext, TEvent]] = js.native
  
  /**
    * The potential transition(s) to be taken upon reaching a final child state node.
    *
    * This is equivalent to defining a `[done(id)]` transition on this state node's `on` property.
    */
  var onDone: js.UndefOr[String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])] = js.native
  
  /**
    * The action(s) to be executed upon entering the state node.
    *
    * @deprecated Use `entry` instead.
    */
  var onEntry: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The action(s) to be executed upon exiting the state node.
    *
    * @deprecated Use `exit` instead.
    */
  var onExit: js.UndefOr[Actions[TContext, TEvent]] = js.native
  
  /**
    * The order this state node appears. Corresponds to the implicit SCXML document order.
    */
  var order: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated
    */
  var parallel: js.UndefOr[Boolean] = js.native
  
  /**
    * @private
    */
  var parent: js.UndefOr[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  /**
    * The mapping of state node keys to their state node configurations (recursive).
    */
  var states: js.UndefOr[StatesConfig[TContext, TStateSchema, TEvent]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of this state node:
    *
    *  - `'atomic'` - no child state nodes
    *  - `'compound'` - nested child state nodes (XOR)
    *  - `'parallel'` - orthogonal nested child state nodes (AND)
    *  - `'history'` - history state node
    *  - `'final'` - final state node
    */
  var `type`: js.UndefOr[atomic | compound | parallel | `final` | history] = js.native
}
object StateNodeConfig {
  
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](): StateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class StateNodeConfigMutableBuilder[Self <: StateNodeConfig[_, _, _], TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (StateNodeConfig[TContext, TStateSchema, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActivities(value: SingleOrArray[Activity[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: (Activity[TContext, TEvent])*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: DelayedTransitions[TContext, TEvent]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAfterVarargs(
      value: ((TransitionConfig[TContext, TEvent]) with (typingsSlinky.xstate.anon.Delay[TContext, TEvent]))*
    ): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setAlways(value: TransitionConfigOrTarget[TContext, TEvent]): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    @scala.inline
    def setAlwaysVarargs(value: ((TransitionConfigTarget[TContext, TEvent]) | (TransitionConfig[TContext, TEvent]))*): Self = StObject.set(x, "always", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: TContext | js.Function0[TContext]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextFunction0(value: () => TContext): Self = StObject.set(x, "context", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setEntry(value: Actions[TContext, TEvent]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "entry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: Actions[TContext, TEvent]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setExitVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "exit", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: shallow | deep | Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setInvoke(value: SingleOrArray[(InvokeConfig[TContext, TEvent]) | (StateMachine[_, _, _, ContextAny])]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
    
    @scala.inline
    def setInvokeVarargs(value: ((InvokeConfig[TContext, TEvent]) | (StateMachine[js.Any, js.Any, js.Any, ContextAny]))*): Self = StObject.set(x, "invoke", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setOn(value: TransitionsConfig[TContext, TEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
    
    @scala.inline
    def setOnDoneVarargs(value: (TransitionConfig[TContext, DoneEventObject])*): Self = StObject.set(x, "onDone", js.Array(value :_*))
    
    @scala.inline
    def setOnEntry(value: Actions[TContext, TEvent]): Self = StObject.set(x, "onEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "onEntry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnEntryUndefined: Self = StObject.set(x, "onEntry", js.undefined)
    
    @scala.inline
    def setOnEntryVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onEntry", js.Array(value :_*))
    
    @scala.inline
    def setOnExit(value: Actions[TContext, TEvent]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    @scala.inline
    def setOnExitVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "onExit", js.Array(value :_*))
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOnVarargs(
      value: (((TransitionConfig[TContext, TEvent]) with typingsSlinky.xstate.anon.Event[TEvent]) | ((TransitionConfig[TContext, TEvent]) with `0`) | ((TransitionConfig[TContext, TEvent]) with `1`))*
    ): Self = StObject.set(x, "on", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    @scala.inline
    def setParent(value: StateNode[TContext, _, TEvent, ContextTContext[TContext]]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setStates(value: StatesConfig[TContext, TStateSchema, TEvent]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
