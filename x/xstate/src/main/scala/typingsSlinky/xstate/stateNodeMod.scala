package typingsSlinky.xstate

import typingsSlinky.std.Partial
import typingsSlinky.xstate.anon.Value
import typingsSlinky.xstate.stateMod.State
import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.ActivityDefinition
import typingsSlinky.xstate.typesMod.DelayedTransitionDefinition
import typingsSlinky.xstate.typesMod.Event
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.HistoryValue
import typingsSlinky.xstate.typesMod.InvokeDefinition
import typingsSlinky.xstate.typesMod.MachineOptions
import typingsSlinky.xstate.typesMod.Mapper
import typingsSlinky.xstate.typesMod.PropertyMapper
import typingsSlinky.xstate.typesMod.StateNodeConfig
import typingsSlinky.xstate.typesMod.StateNodeDefinition
import typingsSlinky.xstate.typesMod.StateNodesConfig
import typingsSlinky.xstate.typesMod.StateSchema
import typingsSlinky.xstate.typesMod.StateValue
import typingsSlinky.xstate.typesMod.StateValueMap
import typingsSlinky.xstate.typesMod.TransitionDefinition
import typingsSlinky.xstate.typesMod.TransitionDefinitionMap
import typingsSlinky.xstate.typesMod.Typestate
import typingsSlinky.xstate.xstateBooleans.`false`
import typingsSlinky.xstate.xstateBooleans.`true`
import typingsSlinky.xstate.xstateStrings.`final`
import typingsSlinky.xstate.xstateStrings.atomic
import typingsSlinky.xstate.xstateStrings.compound
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.history
import typingsSlinky.xstate.xstateStrings.parallel
import typingsSlinky.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/StateNode", JSImport.Namespace)
@js.native
object stateNodeMod extends js.Object {
  
  @js.native
  class StateNode[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */] protected () extends js.Object {
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
      options: js.UndefOr[scala.Nothing],
      /**
      * The initial extended state
      */
    context: TContext
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
    
    var __cache: js.Any = js.native
    
    var __xstatenode: `true` = js.native
    
    var _init: js.Any = js.native
    
    /**
      * Whether the state node is "transient". A state node is considered transient if it has
      * an immediate transition from a "null event" (empty string), taken upon entering the state node.
      */
    var _transient: js.Any = js.native
    
    var _transition: js.Any = js.native
    
    /**
      * The activities to be started upon entering the state node,
      * and stopped upon exiting the state node.
      */
    var activities: js.Array[ActivityDefinition[TContext, TEvent]] = js.native
    
    def after: js.Array[DelayedTransitionDefinition[TContext, TEvent]] = js.native
    
    /**
      * The raw config used to create the machine.
      */
    var config: StateNodeConfig[TContext, TStateSchema, TEvent] = js.native
    
    /**
      * The initial extended state
      */
    var context: js.UndefOr[TContext] = js.native
    
    /**
      * The well-structured state node definition.
      */
    def definition: StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
    
    /**
      * The string delimiter for serializing the path to a string. The default is "."
      */
    var delimiter: String = js.native
    
    /**
      * The data sent with the "done.state._id_" event if this is a final state node.
      */
    var doneData: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
    
    /**
      * Whether the given state node "escapes" this state node. If the `stateNode` is equal to or the parent of
      * this state node, it does not escape.
      */
    var escapes: js.Any = js.native
    
    /**
      * All the event types accepted by this state node and its descendants.
      */
    def events: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ] = js.native
    
    var formatTransition: js.Any = js.native
    
    var formatTransitions: js.Any = js.native
    
    var getActions: js.Any = js.native
    
    var getCandidates: js.Any = js.native
    
    /**
      * All delayed transitions from the config.
      */
    var getDelayedTransitions: js.Any = js.native
    
    /**
      * Retrieves state nodes from a relative path to this state node.
      *
      * @param relativePath The relative path from this state node
      * @param historyValue
      */
    def getFromRelativePath(relativePath: js.Array[String]): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    
    def getInitialState(stateValue: StateValue): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def getInitialState(stateValue: StateValue, context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    
    /**
      * Returns the leaf nodes from a state path relative to this state node.
      *
      * @param relativeStateId The relative state path to retrieve the state nodes
      * @param history The previous state to retrieve history
      * @param resolve Whether state nodes should resolve to initial child state nodes
      */
    def getRelativeStateNodes(relativeStateId: StateNode[TContext, _, TEvent, Value[TContext]]): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, _, TEvent, Value[TContext]],
      historyValue: js.UndefOr[scala.Nothing],
      resolve: Boolean
    ): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    def getRelativeStateNodes(relativeStateId: StateNode[TContext, _, TEvent, Value[TContext]], historyValue: HistoryValue): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    def getRelativeStateNodes(
      relativeStateId: StateNode[TContext, _, TEvent, Value[TContext]],
      historyValue: HistoryValue,
      resolve: Boolean
    ): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    
    var getResolvedPath: js.Any = js.native
    
    /**
      * Returns the child state node from its relative `stateKey`, or throws.
      */
    def getStateNode(stateKey: String): StateNode[TContext, _, TEvent, Value[TContext]] = js.native
    
    /**
      * Returns the state node with the given `stateId`, or throws.
      *
      * @param stateId The state ID. The prefix "#" is removed.
      */
    def getStateNodeById(stateId: String): StateNode[TContext, _, TEvent, Value[TContext]] = js.native
    
    /**
      * Returns the relative state node from the given `statePath`, or throws.
      *
      * @param statePath The string or string array relative path to the state node.
      */
    def getStateNodeByPath(statePath: String): StateNode[TContext, _, TEvent, Value[TContext]] = js.native
    def getStateNodeByPath(statePath: js.Array[String]): StateNode[TContext, _, TEvent, Value[TContext]] = js.native
    
    def getStateNodes(state: State[TContext, TEvent, _, TTypestate]): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    /**
      * Returns the state nodes represented by the current state value.
      *
      * @param state The state value or State instance
      */
    def getStateNodes(state: StateValue): js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    
    /**
      * Returns `true` if this state node explicitly handles the given event.
      *
      * @param event The event in question
      */
    def handles(event: Event[TEvent]): Boolean = js.native
    
    /**
      * The type of history on this state node. Can be:
      *
      *  - `'shallow'` - recalls only top-level historical state value
      *  - `'deep'` - recalls historical state value at all levels
      */
    var history: `false` | shallow | deep = js.native
    
    var historyValue: js.Any = js.native
    
    /**
      * The unique ID of the state node.
      */
    var id: String = js.native
    
    var idMap: js.Any = js.native
    
    /**
      * The initial state node key.
      */
    var initial: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
      ] = js.native
    
    /**
      * The initial State instance, which includes all actions to be executed from
      * entering the initial state.
      */
    def initialState: State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    
    def initialStateNodes: js.Array[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    
    /* private */ def initialStateValue: js.Any = js.native
    
    /**
      * The services invoked by this state node.
      */
    var invoke: js.Array[InvokeDefinition[TContext, TEvent]] = js.native
    
    /**
      * The relative key of the state node, which represents its location in the overall state value.
      */
    var key: String = js.native
    
    /**
      * The root machine node.
      */
    var machine: StateNode[TContext, _, TEvent, Value[TContext]] = js.native
    
    /**
      * The meta data associated with this state node, which will be returned in State instances.
      */
    var meta: js.UndefOr[js.Any] = js.native
    
    var next: js.Any = js.native
    
    var nodesFromChild: js.Any = js.native
    
    /**
      * The mapping of events to transitions.
      */
    def on: TransitionDefinitionMap[TContext, TEvent] = js.native
    
    /**
      * The action(s) to be executed upon entering the state node.
      */
    var onEntry: js.Array[ActionObject[TContext, TEvent]] = js.native
    
    /**
      * The action(s) to be executed upon exiting the state node.
      */
    var onExit: js.Array[ActionObject[TContext, TEvent]] = js.native
    
    var options: MachineOptions[TContext, TEvent] = js.native
    
    /**
      * The order this state node appears. Corresponds to the implicit SCXML document order.
      */
    var order: Double = js.native
    
    /**
      * All the events that have transitions directly from this state node.
      *
      * Excludes any inert events.
      */
    def ownEvents: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ] = js.native
    
    /**
      * (DEPRECATED) Whether the state node is a parallel state node.
      *
      * Use `type: 'parallel'` instead.
      */
    var parallel: js.UndefOr[Boolean] = js.native
    
    /**
      * The parent state node.
      */
    var parent: js.UndefOr[StateNode[TContext, _, TEvent, Value[TContext]]] = js.native
    
    /**
      * The string path from the root machine node to this node.
      */
    var path: js.Array[String] = js.native
    
    /**
      * Resolves a partial state value with its full representation in this machine.
      *
      * @param stateValue The partial state value to resolve.
      */
    def resolve(stateValue: StateValue): StateValue = js.native
    
    /**
      * Resolves to the historical value(s) of the parent state node,
      * represented by state nodes.
      *
      * @param historyValue
      */
    var resolveHistory: js.Any = js.native
    
    var resolveRaisedTransition: js.Any = js.native
    
    /**
      * Resolves the given `state` to a new `State` instance relative to this machine.
      *
      * This ensures that `.events` and `.nextEvents` represent the correct values.
      *
      * @param state The state to resolve
      */
    def resolveState(state: State[TContext, TEvent, _, Value[TContext]]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    
    var resolveTarget: js.Any = js.native
    
    var resolveTransition: js.Any = js.native
    
    /**
      * All the state node IDs of this state node and its descendant state nodes.
      */
    def stateIds: js.Array[String] = js.native
    
    /**
      * The child state nodes.
      */
    var states: StateNodesConfig[TContext, TStateSchema, TEvent] = js.native
    
    var strict: Boolean = js.native
    
    /**
      * The target state value of the history state node, if it exists. This represents the
      * default state value to transition to if no history value exists yet.
      */
    def target: js.UndefOr[StateValue] = js.native
    
    def toJSON(): StateNodeDefinition[TContext, TStateSchema, TEvent] = js.native
    
    def transition(state: js.UndefOr[scala.Nothing], event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: js.UndefOr[scala.Nothing], event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: js.UndefOr[scala.Nothing], event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(
      state: js.UndefOr[scala.Nothing],
      event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext
    ): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    /**
      * Determines the next state given the current `state` and sent `event`.
      *
      * @param state The current State instance or state value
      * @param event The event that was sent at the current state
      * @param context The current context (extended state) of the current state
      */
    def transition(state: String, event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: String, event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: String, event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: String, event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: State[TContext, TEvent, _, TTypestate], event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: State[TContext, TEvent, _, TTypestate], event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(
      state: State[TContext, TEvent, _, TTypestate],
      event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]
    ): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(
      state: State[TContext, TEvent, _, TTypestate],
      event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
      context: TContext
    ): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: StateValueMap, event: Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: StateValueMap, event: Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: StateValueMap, event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    def transition(state: StateValueMap, event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent], context: TContext): State[TContext, TEvent, TStateSchema, TTypestate] = js.native
    
    var transitionCompoundNode: js.Any = js.native
    
    var transitionLeafNode: js.Any = js.native
    
    var transitionParallelNode: js.Any = js.native
    
    /**
      * All the transitions that can be taken from this state node.
      */
    def transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
    
    /**
      * The type of this state node:
      *
      *  - `'atomic'` - no child state nodes
      *  - `'compound'` - nested child state nodes (XOR)
      *  - `'parallel'` - orthogonal nested child state nodes (AND)
      *  - `'history'` - history state node
      *  - `'final'` - final state node
      */
    var `type`: atomic | compound | parallel | `final` | history = js.native
    
    /**
      * The machine's own version.
      */
    var version: js.UndefOr[String] = js.native
    
    /**
      * Clones this state machine with custom options and context.
      *
      * @param options Options (actions, guards, activities, services) to recursively merge with the existing options.
      * @param context Custom context (will override predefined context)
      */
    def withConfig(options: Partial[MachineOptions[TContext, TEvent]]): StateNode[TContext, TStateSchema, TEvent, TTypestate] = js.native
    def withConfig(options: Partial[MachineOptions[TContext, TEvent]], context: TContext): StateNode[TContext, TStateSchema, TEvent, TTypestate] = js.native
    
    /**
      * Clones this state machine with custom context.
      *
      * @param context Custom context (will override predefined context, not recursive)
      */
    def withContext(context: TContext): StateNode[TContext, TStateSchema, TEvent, Value[TContext]] = js.native
  }
}
