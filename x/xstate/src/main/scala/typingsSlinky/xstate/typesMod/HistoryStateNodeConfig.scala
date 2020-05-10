package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.xstateBooleans.`true`
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  @JSName("history")
  var history_HistoryStateNodeConfig: shallow | deep | `true` = js.native
  var target: js.UndefOr[StateValue] = js.native
}

object HistoryStateNodeConfig {
  @scala.inline
  def apply[TContext, TEvent](history: shallow | deep | `true`): HistoryStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStateNodeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class HistoryStateNodeConfigOps[Self[tcontext, tevent] <: HistoryStateNodeConfig[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withHistory(value: shallow | deep | `true`): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: StateValue): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

