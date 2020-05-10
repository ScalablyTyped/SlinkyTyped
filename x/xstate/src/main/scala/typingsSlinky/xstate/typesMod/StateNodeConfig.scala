package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.`final`
import typingsSlinky.xstate.xstateStrings.atomic
import typingsSlinky.xstate.xstateStrings.compound
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.history
import typingsSlinky.xstate.xstateStrings.parallel
import typingsSlinky.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.native
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
  var invoke: js.UndefOr[SingleOrArray[InvokeConfig[TContext, TEvent]]] = js.native
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
  var parent: js.UndefOr[StateNode[TContext, _, TEvent, _]] = js.native
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
  def apply[TContext, TStateSchema, TEvent](): StateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class StateNodeConfigOps[Self[tcontext, tstateschema, tevent] <: StateNodeConfig[tcontext, tstateschema, tevent], TContext, TStateSchema, TEvent] (val x: Self[TContext, TStateSchema, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TStateSchema, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TStateSchema, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TStateSchema, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TStateSchema, TEvent]) with Other]
    @scala.inline
    def withActivities(value: SingleOrArray[Activity[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: DelayedTransitions[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFunction0(value: () => TContext): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContext(value: TContext | js.Function0[TContext]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction2(value: (TContext, TEvent) => js.Any): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData(value: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEntry(value: Actions[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExit(value: Actions[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: shallow | deep | Boolean): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoke(value: SingleOrArray[InvokeConfig[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoke: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: TransitionsConfig[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDone(value: String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]])): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDone: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEntryFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntry")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnEntry(value: Actions[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEntry: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExitFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnExit(value: Actions[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel(value: Boolean): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: StateNode[TContext, _, TEvent, _]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: StatesConfig[TContext, TStateSchema, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: atomic | compound | parallel | `final` | history): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

