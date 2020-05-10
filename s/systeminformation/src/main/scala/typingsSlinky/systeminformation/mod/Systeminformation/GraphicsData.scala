package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsData extends js.Object {
  var controllers: js.Array[GraphicsControllerData] = js.native
  var displays: js.Array[GraphicsDisplayData] = js.native
}

object GraphicsData {
  @scala.inline
  def apply(controllers: js.Array[GraphicsControllerData], displays: js.Array[GraphicsDisplayData]): GraphicsData = {
    val __obj = js.Dynamic.literal(controllers = controllers.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  @scala.inline
  implicit class GraphicsDataOps[Self <: GraphicsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllers(value: js.Array[GraphicsControllerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplays(value: js.Array[GraphicsDisplayData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

