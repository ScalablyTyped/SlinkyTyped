package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Start
import typingsSlinky.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeActionObject[TContext, TEvent /* <: EventObject */] extends ActivityActionObject[TContext, TEvent] {
  @JSName("activity")
  var activity_InvokeActionObject: InvokeDefinition[TContext, TEvent] = js.native
}

object InvokeActionObject {
  @scala.inline
  def apply[TContext, TEvent](activity: InvokeDefinition[TContext, TEvent], `type`: Start | Stop): InvokeActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeActionObject[TContext, TEvent]]
  }
  @scala.inline
  implicit class InvokeActionObjectOps[Self[tcontext, tevent] <: InvokeActionObject[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withActivity(value: InvokeDefinition[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

