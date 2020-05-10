package typingsSlinky.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApplicationExit extends js.Object {
  var onexiting: js.Any = js.native
  def exit(): Unit = js.native
}

object ICoreApplicationExit {
  @scala.inline
  def apply(exit: () => Unit, onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), onexiting = onexiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreApplicationExit]
  }
  @scala.inline
  implicit class ICoreApplicationExitOps[Self <: ICoreApplicationExit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnexiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onexiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

