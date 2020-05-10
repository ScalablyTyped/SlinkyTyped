package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  var entry: js.Array[ActionObject[TContext, TEvent]] = js.native
  var exit: js.Array[ActionObject[TContext, TEvent]] = js.native
}

object EntryExitEffectMap {
  @scala.inline
  def apply[TContext, TEvent](entry: js.Array[ActionObject[TContext, TEvent]], exit: js.Array[ActionObject[TContext, TEvent]]): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
  @scala.inline
  implicit class EntryExitEffectMapOps[Self[tcontext, tevent] <: EntryExitEffectMap[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Array[ActionObject[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

