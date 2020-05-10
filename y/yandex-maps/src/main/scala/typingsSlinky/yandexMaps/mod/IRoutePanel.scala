package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.multiRouter.MultiRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoutePanel extends js.Object {
  var options: IOptionManager = js.native
  var state: IDataManager = js.native
  def getRoute(): MultiRoute = js.native
  def switchPoints(): Unit = js.native
}

object IRoutePanel {
  @scala.inline
  def apply(getRoute: () => MultiRoute, options: IOptionManager, state: IDataManager, switchPoints: () => Unit): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = js.Any.fromFunction0(switchPoints))
    __obj.asInstanceOf[IRoutePanel]
  }
  @scala.inline
  implicit class IRoutePanelOps[Self <: IRoutePanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRoute(value: () => MultiRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: IOptionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: IDataManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchPoints(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchPoints")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

