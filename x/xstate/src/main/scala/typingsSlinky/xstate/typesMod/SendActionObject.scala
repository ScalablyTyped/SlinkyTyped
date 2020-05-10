package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendActionObject[TContext, TEvent /* <: EventObject */] extends SendAction[TContext, TEvent] {
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.native
  @JSName("event")
  var event_SendActionObject: TEvent = js.native
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (Actor[_, AnyEventObject])] = js.native
}

object SendActionObject {
  @scala.inline
  def apply[TContext, TEvent](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    event: TEvent,
    id: String | Double,
    `type`: String
  ): SendActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent]]
  }
  @scala.inline
  implicit class SendActionObjectOps[Self[tcontext, tevent] <: SendActionObject[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
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
    def withEvent(value: TEvent): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String | Double | (Actor[_, AnyEventObject])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

