package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowPopupShowingEventArgs extends js.Object {
  def setDesiredSize(value: Size): Unit = js.native
}

object ICoreWindowPopupShowingEventArgs {
  @scala.inline
  def apply(setDesiredSize: Size => Unit): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
  @scala.inline
  implicit class ICoreWindowPopupShowingEventArgsOps[Self <: ICoreWindowPopupShowingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetDesiredSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDesiredSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

