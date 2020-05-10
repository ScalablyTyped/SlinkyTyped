package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.xstate.typesMod._Action because Already inherited */ @js.native
trait SendAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  var event: TEvent | (SendExpr[TContext, TEvent]) = js.native
  var id: String | Double = js.native
  var to: js.UndefOr[
    String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}

object SendAction {
  @scala.inline
  def apply[TContext, TEvent](event: TEvent | (SendExpr[TContext, TEvent]), id: String | Double, `type`: String): SendAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class SendActionOps[Self[tcontext, tevent] <: SendAction[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withEventFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => TEvent): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEvent(value: TEvent | (SendExpr[TContext, TEvent])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self[TContext, TEvent] = {
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
    def withToFunction3(
      value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => String | Double | (Actor[_, AnyEventObject])
    ): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTo(
      value: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
    ): Self[TContext, TEvent] = {
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

