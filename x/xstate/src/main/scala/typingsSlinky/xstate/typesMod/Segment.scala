package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * Event from state.
    */
  var event: TEvent = js.native
  /**
    * From state.
    */
  var state: State[TContext, TEvent, _, _] = js.native
}

object Segment {
  @scala.inline
  def apply[TContext, TEvent](event: TEvent, state: State[TContext, TEvent, _, _]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
  @scala.inline
  implicit class SegmentOps[Self[tcontext, tevent] <: Segment[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withEvent(value: TEvent): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State[TContext, TEvent, _, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

