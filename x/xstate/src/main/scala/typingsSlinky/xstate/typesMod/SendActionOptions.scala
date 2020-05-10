package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var to: js.UndefOr[
    String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.native
}

object SendActionOptions {
  @scala.inline
  def apply[TContext, TEvent](): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
  @scala.inline
  implicit class SendActionOptionsOps[Self[tcontext, tevent] <: SendActionOptions[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
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
    def withId(value: String | Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withTo(value: String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])): Self[TContext, TEvent] = {
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

