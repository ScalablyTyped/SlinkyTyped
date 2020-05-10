package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Partial
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
trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var activities: js.Array[ActivityDefinition[TContext, TEvent]] = js.native
  var context: TContext = js.native
  var data: js.UndefOr[(Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any] = js.native
  var entry: js.Array[ActionObject[TContext, TEvent]] = js.native
  var exit: js.Array[ActionObject[TContext, TEvent]] = js.native
  var history: js.UndefOr[Boolean | shallow | deep] = js.native
  var id: String = js.native
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  var invoke: js.Array[InvokeDefinition[TContext, TEvent]] = js.native
  var key: String = js.native
  var meta: js.Any = js.native
  var on: TransitionDefinitionMap[TContext, TEvent] = js.native
  var order: Double = js.native
  var states: StatesDefinition[TContext, TStateSchema, TEvent] = js.native
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  var `type`: atomic | compound | parallel | `final` | history = js.native
  var version: js.UndefOr[String] = js.native
}

object StateNodeDefinition {
  @scala.inline
  def apply[TContext, TStateSchema, TEvent](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    context: TContext,
    entry: js.Array[ActionObject[TContext, TEvent]],
    exit: js.Array[ActionObject[TContext, TEvent]],
    id: String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: String,
    meta: js.Any,
    on: TransitionDefinitionMap[TContext, TEvent],
    order: Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class StateNodeDefinitionOps[Self[tcontext, tstateschema, tevent] <: StateNodeDefinition[tcontext, tstateschema, tevent], TContext, TStateSchema, TEvent] (val x: Self[TContext, TStateSchema, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TStateSchema, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TStateSchema, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TStateSchema, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TStateSchema, TEvent]) with Other]
    @scala.inline
    def withActivities(value: js.Array[ActivityDefinition[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoke(value: js.Array[InvokeDefinition[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: TransitionDefinitionMap[TContext, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: StatesDefinition[TContext, TStateSchema, TEvent]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: atomic | compound | parallel | `final` | history): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFunction3(value: (TContext, TEvent, /* meta */ AssignMeta[TContext, TEvent]) => Partial[TContext]): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withData(value: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any): Self[TContext, TStateSchema, TEvent] = {
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
    def withHistory(value: Boolean | shallow | deep): Self[TContext, TStateSchema, TEvent] = {
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
    def withVersion(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

