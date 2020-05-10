package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsDisplayData extends js.Object {
  var builtin: Boolean = js.native
  var connection: String = js.native
  var currentRefreshRate: Double = js.native
  var currentResX: Double = js.native
  var currentResY: Double = js.native
  var main: Boolean = js.native
  var model: String = js.native
  var pixeldepth: Double = js.native
  var positionX: Double = js.native
  var positionY: Double = js.native
  var resolutionx: Double = js.native
  var resolutiony: Double = js.native
  var sizex: Double = js.native
  var sizey: Double = js.native
  var vendor: String = js.native
}

object GraphicsDisplayData {
  @scala.inline
  def apply(
    builtin: Boolean,
    connection: String,
    currentRefreshRate: Double,
    currentResX: Double,
    currentResY: Double,
    main: Boolean,
    model: String,
    pixeldepth: Double,
    positionX: Double,
    positionY: Double,
    resolutionx: Double,
    resolutiony: Double,
    sizex: Double,
    sizey: Double,
    vendor: String
  ): GraphicsDisplayData = {
    val __obj = js.Dynamic.literal(builtin = builtin.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], currentRefreshRate = currentRefreshRate.asInstanceOf[js.Any], currentResX = currentResX.asInstanceOf[js.Any], currentResY = currentResY.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixeldepth = pixeldepth.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], resolutionx = resolutionx.asInstanceOf[js.Any], resolutiony = resolutiony.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsDisplayData]
  }
  @scala.inline
  implicit class GraphicsDisplayDataOps[Self <: GraphicsDisplayData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRefreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentResX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentResX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentResY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentResY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixeldepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixeldepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutiony(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutiony")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

