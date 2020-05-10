package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Start
import typingsSlinky.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityActionObject[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var activity: ActivityDefinition[TContext, TEvent] = js.native
  @JSName("exec")
  var exec_ActivityActionObject: js.UndefOr[ActionFunction[TContext, TEvent]] = js.native
  @JSName("type")
  var type_ActivityActionObject: Start | Stop = js.native
}

object ActivityActionObject {
  @scala.inline
  def apply[TContext, TEvent](activity: ActivityDefinition[TContext, TEvent], `type`: Start | Stop): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
  @scala.inline
  implicit class ActivityActionObjectOps[Self[tcontext, tevent] <: ActivityActionObject[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withActivity(value: ActivityDefinition[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Start | Stop): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExec(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExec: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
  }
  
}

