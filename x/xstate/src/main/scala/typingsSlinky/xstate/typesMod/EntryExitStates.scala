package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Set
import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryExitStates[TContext] extends js.Object {
  var entry: Set[StateNode[TContext, _, EventObject, _]] = js.native
  var exit: Set[StateNode[TContext, _, EventObject, _]] = js.native
}

object EntryExitStates {
  @scala.inline
  def apply[TContext](
    entry: Set[StateNode[TContext, _, EventObject, _]],
    exit: Set[StateNode[TContext, _, EventObject, _]]
  ): EntryExitStates[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStates[TContext]]
  }
  @scala.inline
  implicit class EntryExitStatesOps[Self[tcontext] <: EntryExitStates[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withEntry(value: Set[StateNode[TContext, _, EventObject, _]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: Set[StateNode[TContext, _, EventObject, _]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

