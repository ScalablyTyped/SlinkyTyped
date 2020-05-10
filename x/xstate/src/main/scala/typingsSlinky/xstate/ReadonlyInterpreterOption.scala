package typingsSlinky.xstate

import typingsSlinky.xstate.interpreterMod.Clock
import typingsSlinky.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<xstate.xstate/lib/types.InterpreterOptions> */
@js.native
trait ReadonlyInterpreterOption extends js.Object {
  val clock: Clock = js.native
  val deferEvents: Boolean = js.native
  val devTools: Boolean | js.Object = js.native
  val execute: Boolean = js.native
  val id: js.UndefOr[String] = js.native
  val parent: js.UndefOr[Interpreter[_, _, _, _]] = js.native
  def logger(args: js.Any*): Unit = js.native
}

object ReadonlyInterpreterOption {
  @scala.inline
  def apply(
    clock: Clock,
    deferEvents: Boolean,
    devTools: Boolean | js.Object,
    execute: Boolean,
    logger: /* repeated */ js.Any => Unit
  ): ReadonlyInterpreterOption = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], deferEvents = deferEvents.asInstanceOf[js.Any], devTools = devTools.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger))
    __obj.asInstanceOf[ReadonlyInterpreterOption]
  }
  @scala.inline
  implicit class ReadonlyInterpreterOptionOps[Self <: ReadonlyInterpreterOption] (val x: Self) extends AnyVal {
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
    def withDeferEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevTools(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
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

