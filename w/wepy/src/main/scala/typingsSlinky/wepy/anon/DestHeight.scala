package typingsSlinky.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestHeight extends js.Object {
  var canvasId: String = js.native
  var destHeight: Double = js.native
  var destWidth: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object DestHeight {
  @scala.inline
  def apply(
    canvasId: String,
    destHeight: Double,
    destWidth: Double,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): DestHeight = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestHeight]
  }
  @scala.inline
  implicit class DestHeightOps[Self <: DestHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

