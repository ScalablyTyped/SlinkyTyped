package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateLike[TContext] extends js.Object {
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[EventObject] = js.native
  var context: TContext = js.native
  var event: EventObject = js.native
  var value: StateValue = js.native
}

object StateLike {
  @scala.inline
  def apply[TContext](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[EventObject],
    context: TContext,
    event: EventObject,
    value: StateValue
  ): StateLike[TContext] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateLike[TContext]]
  }
  @scala.inline
  implicit class StateLikeOps[Self[tcontext] <: StateLike[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def with_event(value: typingsSlinky.xstate.typesMod.SCXML.Event[EventObject]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: EventObject): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: StateValue): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

