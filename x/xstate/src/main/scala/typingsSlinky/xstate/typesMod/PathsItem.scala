package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathsItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]] = js.native
  var state: State[TContext, TEvent, _, _] = js.native
}

object PathsItem {
  @scala.inline
  def apply[TContext, TEvent](paths: js.Array[js.Array[Segment[TContext, TEvent]]], state: State[TContext, TEvent, _, _]): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
  @scala.inline
  implicit class PathsItemOps[Self[tcontext, tevent] <: PathsItem[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withPaths(value: js.Array[js.Array[Segment[TContext, TEvent]]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State[TContext, TEvent, _, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

