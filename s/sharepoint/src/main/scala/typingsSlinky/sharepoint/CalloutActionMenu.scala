package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutActionMenu extends js.Object {
  def addAction(action: CalloutAction): Unit = js.native
  def calculateActionWidth(): Unit = js.native
  def getActions(): js.Array[CalloutAction] = js.native
  def refreshActions(): Unit = js.native
  def render(): Unit = js.native
}

object CalloutActionMenu {
  @scala.inline
  def apply(
    addAction: CalloutAction => Unit,
    calculateActionWidth: () => Unit,
    getActions: () => js.Array[CalloutAction],
    refreshActions: () => Unit,
    render: () => Unit
  ): CalloutActionMenu = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1(addAction), calculateActionWidth = js.Any.fromFunction0(calculateActionWidth), getActions = js.Any.fromFunction0(getActions), refreshActions = js.Any.fromFunction0(refreshActions), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[CalloutActionMenu]
  }
  @scala.inline
  implicit class CalloutActionMenuOps[Self <: CalloutActionMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAction(value: CalloutAction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateActionWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateActionWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActions(value: () => js.Array[CalloutAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefreshActions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

