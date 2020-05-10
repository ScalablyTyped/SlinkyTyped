package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: js.Any = js.native
  @JSName("type")
  var type_AnyAssignAction: Assign = js.native
}

object AnyAssignAction {
  @scala.inline
  def apply[TContext, TEvent](assignment: js.Any, `type`: Assign): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class AnyAssignActionOps[Self[tcontext, tevent] <: AnyAssignAction[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withAssignment(value: js.Any): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Assign): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

