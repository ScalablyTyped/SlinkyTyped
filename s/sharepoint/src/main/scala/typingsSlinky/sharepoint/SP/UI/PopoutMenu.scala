package typingsSlinky.sharepoint.SP.UI

import typingsSlinky.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoutMenu extends IDisposable {
  def closeMenu(): Unit = js.native
  def launchMenu(): Unit = js.native
}

object PopoutMenu {
  @scala.inline
  def apply(closeMenu: () => Unit, dispose: () => Unit, launchMenu: () => Unit): PopoutMenu = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), dispose = js.Any.fromFunction0(dispose), launchMenu = js.Any.fromFunction0(launchMenu))
    __obj.asInstanceOf[PopoutMenu]
  }
  @scala.inline
  implicit class PopoutMenuOps[Self <: PopoutMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLaunchMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchMenu")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

