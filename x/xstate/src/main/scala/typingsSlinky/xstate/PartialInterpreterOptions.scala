package typingsSlinky.xstate

import typingsSlinky.xstate.interpreterMod.Clock
import typingsSlinky.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<xstate.xstate/lib/types.InterpreterOptions> */
@js.native
trait PartialInterpreterOptions extends js.Object {
  var clock: js.UndefOr[Clock] = js.native
  var deferEvents: js.UndefOr[Boolean] = js.native
  var devTools: js.UndefOr[Boolean | js.Object] = js.native
  var execute: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var parent: js.UndefOr[Interpreter[_, _, _, _]] = js.native
}

object PartialInterpreterOptions {
  @scala.inline
  def apply(): PartialInterpreterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterpreterOptions]
  }
  @scala.inline
  implicit class PartialInterpreterOptionsOps[Self <: PartialInterpreterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClock(value: Clock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDevTools(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devTools")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Interpreter[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

