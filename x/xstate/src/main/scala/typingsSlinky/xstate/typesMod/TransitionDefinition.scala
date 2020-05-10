package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("actions")
  var actions_TransitionDefinition: js.Array[ActionObject[TContext, TEvent]] = js.native
  @JSName("cond")
  var cond_TransitionDefinition: js.UndefOr[Guard[TContext, TEvent]] = js.native
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typingsSlinky.xstate.typesMod.ActionTypes.NullEvent | Asterisk = js.native
  var source: StateNode[TContext, _, TEvent, _] = js.native
  @JSName("target")
  var target_TransitionDefinition: js.UndefOr[js.Array[StateNode[TContext, _, TEvent, _]]] = js.native
}

object TransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typingsSlinky.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, _]
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
  @scala.inline
  implicit class TransitionDefinitionOps[Self[tcontext, tevent] <: TransitionDefinition[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
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
    def withEventType(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typingsSlinky.xstate.typesMod.ActionTypes.NullEvent | Asterisk
    ): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: StateNode[TContext, _, TEvent, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCond(value: Guard[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCond: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

