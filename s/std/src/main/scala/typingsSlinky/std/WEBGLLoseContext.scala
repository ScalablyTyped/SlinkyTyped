package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WEBGLLoseContext extends js.Object {
  def loseContext(): Unit = js.native
  def restoreContext(): Unit = js.native
}

object WEBGLLoseContext {
  @scala.inline
  def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  @scala.inline
  implicit class WEBGLLoseContextOps[Self <: WEBGLLoseContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoseContext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loseContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestoreContext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreContext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

