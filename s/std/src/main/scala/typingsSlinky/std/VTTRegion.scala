package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VTTRegion extends js.Object {
  var id: java.lang.String = js.native
  var lines: Double = js.native
  var regionAnchorX: Double = js.native
  var regionAnchorY: Double = js.native
  var scroll: ScrollSetting = js.native
  var viewportAnchorX: Double = js.native
  var viewportAnchorY: Double = js.native
  var width: Double = js.native
}

object VTTRegion {
  @scala.inline
  def apply(
    id: java.lang.String,
    lines: Double,
    regionAnchorX: Double,
    regionAnchorY: Double,
    scroll: ScrollSetting,
    viewportAnchorX: Double,
    viewportAnchorY: Double,
    width: Double
  ): VTTRegion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], regionAnchorX = regionAnchorX.asInstanceOf[js.Any], regionAnchorY = regionAnchorY.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], viewportAnchorX = viewportAnchorX.asInstanceOf[js.Any], viewportAnchorY = viewportAnchorY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VTTRegion]
  }
  @scala.inline
  implicit class VTTRegionOps[Self <: VTTRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionAnchorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionAnchorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionAnchorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionAnchorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: ScrollSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportAnchorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportAnchorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportAnchorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportAnchorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

