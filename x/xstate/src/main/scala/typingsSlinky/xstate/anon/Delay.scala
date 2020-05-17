package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: Double | String | (Expr[TContext, TEvent, Double]) = js.native
}

object Delay {
  @scala.inline
  def apply[TContext, TEvent](delay: Double | String | (Expr[TContext, TEvent, Double])): Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay[TContext, TEvent]]
  }
  @scala.inline
  implicit class DelayOps[Self[tcontext, tevent] <: Delay[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withDelayFunction2(value: (TContext, TEvent) => Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double | String | (Expr[TContext, TEvent, Double])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

