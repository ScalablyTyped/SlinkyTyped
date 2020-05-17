package typingsSlinky.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends /* other */ StringDictionary[js.Any]
     with Action[TContext, TEvent] {
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent]] = js.native
  /**
    * The type of action that is executed.
    */
  var `type`: String = js.native
}

object ActionObject {
  @scala.inline
  def apply[TContext, TEvent](`type`: String): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
  @scala.inline
  implicit class ActionObjectOps[Self[tcontext, tevent] <: ActionObject[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withType(value: String): Self[TContext, TEvent] = {
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

