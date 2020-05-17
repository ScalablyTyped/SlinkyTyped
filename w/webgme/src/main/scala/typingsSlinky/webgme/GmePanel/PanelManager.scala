package typingsSlinky.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelManager extends js.Object {
  def getActivePanel(): PanelBase = js.native
  def setActivePanel(panel: PanelBase): Unit = js.native
}

object PanelManager {
  @scala.inline
  def apply(getActivePanel: () => PanelBase, setActivePanel: PanelBase => Unit): PanelManager = {
    val __obj = js.Dynamic.literal(getActivePanel = js.Any.fromFunction0(getActivePanel), setActivePanel = js.Any.fromFunction1(setActivePanel))
    __obj.asInstanceOf[PanelManager]
  }
  @scala.inline
  implicit class PanelManagerOps[Self <: PanelManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActivePanel(value: () => PanelBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActivePanel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetActivePanel(value: PanelBase => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActivePanel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

