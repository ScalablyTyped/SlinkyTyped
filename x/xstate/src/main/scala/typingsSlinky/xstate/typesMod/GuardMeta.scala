package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var cond: Guard[TContext, TEvent] = js.native
}

object GuardMeta {
  @scala.inline
  def apply[TContext, TEvent](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    cond: Guard[TContext, TEvent],
    state: State[TContext, TEvent, _, _]
  ): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
  @scala.inline
  implicit class GuardMetaOps[Self[tcontext, tevent] <: GuardMeta[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withCond(value: Guard[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

