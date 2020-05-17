package typingsSlinky.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearUnused extends js.Object {
  def clearUnused(): Unit = js.native
  def markAllAsUnused(): Unit = js.native
  def register(subscribe: js.Function0[Unit]): Unit = js.native
}

object ClearUnused {
  @scala.inline
  def apply(clearUnused: () => Unit, markAllAsUnused: () => Unit, register: js.Function0[Unit] => Unit): ClearUnused = {
    val __obj = js.Dynamic.literal(clearUnused = js.Any.fromFunction0(clearUnused), markAllAsUnused = js.Any.fromFunction0(markAllAsUnused), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[ClearUnused]
  }
  @scala.inline
  implicit class ClearUnusedOps[Self <: ClearUnused] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearUnused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearUnused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkAllAsUnused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAllAsUnused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegister(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

