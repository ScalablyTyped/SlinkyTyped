package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowResizeManager extends js.Object {
  def notifyLayoutCompleted(): Unit = js.native
}

object ICoreWindowResizeManager {
  @scala.inline
  def apply(notifyLayoutCompleted: () => Unit): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
  @scala.inline
  implicit class ICoreWindowResizeManagerOps[Self <: ICoreWindowResizeManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyLayoutCompleted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyLayoutCompleted")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

