package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Record
import typingsSlinky.xstate.actorMod.Actor
import typingsSlinky.xstate.stateMod.State
import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
  var _sessionid: String | Null = js.native
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.native
  var activities: js.UndefOr[ActivityMap] = js.native
  var children: Record[String, Actor[_, AnyEventObject]] = js.native
  var configuration: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
  var context: TContext = js.native
  var done: js.UndefOr[Boolean] = js.native
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  var history: js.UndefOr[State[TContext, TEvent, _, _]] = js.native
  var historyValue: js.UndefOr[HistoryValue] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  var value: StateValue = js.native
}

object StateConfig {
  @scala.inline
  def apply[TContext, TEvent](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    children: Record[String, Actor[_, AnyEventObject]],
    configuration: js.Array[StateNode[TContext, _, TEvent, _]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class StateConfigOps[Self[tcontext, tevent] <: StateConfig[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def with_event(value: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Record[String, Actor[_, AnyEventObject]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: StateValue): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sessionid(value: String): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sessionidNull: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionid")(null)
        ret
    }
    @scala.inline
    def withActions(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withActivities(value: ActivityMap): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: Boolean): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDone: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: State[TContext, TEvent, _, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryValue(value: HistoryValue): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryValue: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

