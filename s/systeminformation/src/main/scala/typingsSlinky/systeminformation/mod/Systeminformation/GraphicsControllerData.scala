package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsControllerData extends js.Object {
  var bus: String = js.native
  var model: String = js.native
  var vendor: String = js.native
  var vram: Double = js.native
  var vramDynamic: Boolean = js.native
}

object GraphicsControllerData {
  @scala.inline
  def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any], vramDynamic = vramDynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsControllerData]
  }
  @scala.inline
  implicit class GraphicsControllerDataOps[Self <: GraphicsControllerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVram(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVramDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vramDynamic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

