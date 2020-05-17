package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.`0`
import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]] = js.native
  var cond: js.UndefOr[Condition[TContext, TEvent with (`0`[TEventType, TEvent])]] = js.native
  var event: TEventType = js.native
  var meta: js.UndefOr[MetaObject] = js.native
  var source: StateNode[TContext, _, TEvent, _] = js.native
  var target: StateNode[TContext, _, TEvent, _] = js.native
  var transition: TransitionDefinition[TContext, TEvent] = js.native
}

object Edge {
  @scala.inline
  def apply[TContext, TEvent, TEventType](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, _, TEvent, _],
    target: StateNode[TContext, _, TEvent, _],
    transition: TransitionDefinition[TContext, TEvent]
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
  @scala.inline
  implicit class EdgeOps[Self[tcontext, tevent, teventtype] <: Edge[tcontext, tevent, teventtype], TContext, TEvent, TEventType] (val x: Self[TContext, TEvent, TEventType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent, TEventType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent, TEventType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent, TEventType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent, TEventType]) with Other]
    @scala.inline
    def withActions(value: js.Array[Action[TContext, TEvent]]): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: TEventType): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: StateNode[TContext, _, TEvent, _]): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: StateNode[TContext, _, TEvent, _]): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: TransitionDefinition[TContext, TEvent]): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondFunction3(
      value: (TContext, TEvent with (`0`[TEventType, TEvent]), /* meta */ GuardMeta[TContext, TEvent with (`0`[TEventType, TEvent])]) => Boolean
    ): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCond(value: Condition[TContext, TEvent with (`0`[TEventType, TEvent])]): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCond: Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: MetaObject): Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[TContext, TEvent, TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

