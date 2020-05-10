package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]] = js.native
  var onEntry: js.Array[Action[TContext, TEvent]] = js.native
  var onExit: js.Array[Action[TContext, TEvent]] = js.native
}

object ActionMap {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[Action[TContext, TEvent]],
    onEntry: js.Array[Action[TContext, TEvent]],
    onExit: js.Array[Action[TContext, TEvent]]
  ): ActionMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onEntry = onEntry.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMap[TContext, TEvent]]
  }
  @scala.inline
  implicit class ActionMapOps[Self[tcontext, tevent] <: ActionMap[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withActions(value: js.Array[Action[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEntry(value: js.Array[Action[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExit(value: js.Array[Action[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

