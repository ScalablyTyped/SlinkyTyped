package typingsSlinky.xstate.interpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  def clearTimeout(id: js.Any): Unit = js.native
  def setTimeout(fn: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): js.Any = js.native
}

object Clock {
  @scala.inline
  def apply(
    clearTimeout: js.Any => Unit,
    setTimeout: (js.Function1[/* repeated */ js.Any, Unit], Double) => js.Any
  ): Clock = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
    __obj.asInstanceOf[Clock]
  }
  @scala.inline
  implicit class ClockOps[Self <: Clock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTimeout(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimeout(value: (js.Function1[/* repeated */ js.Any, Unit], Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

