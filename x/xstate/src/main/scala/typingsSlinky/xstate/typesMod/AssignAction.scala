package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.typesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) = js.native
  @JSName("type")
  var type_AssignAction: Assign = js.native
}

object AssignAction {
  @scala.inline
  def apply[TContext, TEvent](assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]), `type`: Assign): AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class AssignActionOps[Self[tcontext, tevent] <: AssignAction[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withAssignmentFunction3(value: (TContext, TEvent, /* meta */ AssignMeta[TContext, TEvent]) => Partial[TContext]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAssignment(value: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])): Self[TContext, TEvent] = {
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

