package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PureAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  @JSName("type")
  var type_PureAction: Pure = js.native
  def get(context: TContext, event: TEvent): js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]] = js.native
}

object PureAction {
  @scala.inline
  def apply[TContext, TEvent](get: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]], `type`: Pure): PureAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PureAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class PureActionOps[Self[tcontext, tevent] <: PureAction[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withGet(value: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: Pure): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

