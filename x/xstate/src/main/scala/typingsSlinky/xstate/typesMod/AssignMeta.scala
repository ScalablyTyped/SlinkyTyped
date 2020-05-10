package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
  var action: AssignAction[TContext, TEvent] = js.native
  var state: js.UndefOr[State[TContext, TEvent, _, _]] = js.native
}

object AssignMeta {
  @scala.inline
  def apply[TContext, TEvent](_event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent], action: AssignAction[TContext, TEvent]): AssignMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignMeta[TContext, TEvent]]
  }
  @scala.inline
  implicit class AssignMetaOps[Self[tcontext, tevent] <: AssignMeta[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
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
    def withAction(value: AssignAction[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State[TContext, TEvent, _, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

