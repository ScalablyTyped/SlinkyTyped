package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryExitStateArrays[TContext] extends js.Object {
  var entry: js.Array[StateNode[TContext, _, EventObject, _]] = js.native
  var exit: js.Array[StateNode[TContext, _, EventObject, _]] = js.native
}

object EntryExitStateArrays {
  @scala.inline
  def apply[TContext](
    entry: js.Array[StateNode[TContext, _, EventObject, _]],
    exit: js.Array[StateNode[TContext, _, EventObject, _]]
  ): EntryExitStateArrays[TContext] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitStateArrays[TContext]]
  }
  @scala.inline
  implicit class EntryExitStateArraysOps[Self[tcontext] <: EntryExitStateArrays[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withEntry(value: js.Array[StateNode[TContext, _, EventObject, _]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Array[StateNode[TContext, _, EventObject, _]]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

