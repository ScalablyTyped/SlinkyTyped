package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateTransition[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]] = js.native
  var configuration: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
  var entrySet: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
  var exitSet: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[State[TContext, EventObject, _, _]] = js.native
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
}

object StateTransition {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    configuration: js.Array[StateNode[TContext, _, TEvent, _]],
    entrySet: js.Array[StateNode[TContext, _, TEvent, _]],
    exitSet: js.Array[StateNode[TContext, _, TEvent, _]],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], entrySet = entrySet.asInstanceOf[js.Any], exitSet = exitSet.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
  @scala.inline
  implicit class StateTransitionOps[Self[tcontext, tevent] <: StateTransition[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withActions(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntrySet(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitSet(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: State[TContext, EventObject, _, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

