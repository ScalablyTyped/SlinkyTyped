package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowStatic extends js.Object {
  def getForCurrentThread(): CoreWindow = js.native
}

object ICoreWindowStatic {
  @scala.inline
  def apply(getForCurrentThread: () => CoreWindow): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal(getForCurrentThread = js.Any.fromFunction0(getForCurrentThread))
    __obj.asInstanceOf[ICoreWindowStatic]
  }
  @scala.inline
  implicit class ICoreWindowStaticOps[Self <: ICoreWindowStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetForCurrentThread(value: () => CoreWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentThread")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

