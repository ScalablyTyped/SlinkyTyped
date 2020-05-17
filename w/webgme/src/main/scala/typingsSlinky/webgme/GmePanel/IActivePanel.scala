package typingsSlinky.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActivePanel extends js.Object {
  def getNodeID(): String = js.native
  def onActivate(): Unit = js.native
  def onDeactivate(): Unit = js.native
  def setActive(isActive: Boolean): Unit = js.native
}

object IActivePanel {
  @scala.inline
  def apply(
    getNodeID: () => String,
    onActivate: () => Unit,
    onDeactivate: () => Unit,
    setActive: Boolean => Unit
  ): IActivePanel = {
    val __obj = js.Dynamic.literal(getNodeID = js.Any.fromFunction0(getNodeID), onActivate = js.Any.fromFunction0(onActivate), onDeactivate = js.Any.fromFunction0(onDeactivate), setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[IActivePanel]
  }
  @scala.inline
  implicit class IActivePanelOps[Self <: IActivePanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNodeID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetActive(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

