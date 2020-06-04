package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VTTRegion extends js.Object {
  var id: java.lang.String
  var lines: Double
  var regionAnchorX: Double
  var regionAnchorY: Double
  var scroll: ScrollSetting
  var viewportAnchorX: Double
  var viewportAnchorY: Double
  var width: Double
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionAnchorX(value: Double): Self = this.set("regionAnchorX", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionAnchorY(value: Double): Self = this.set("regionAnchorY", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: ScrollSetting): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportAnchorX(value: Double): Self = this.set("viewportAnchorX", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportAnchorY(value: Double): Self = this.set("viewportAnchorY", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

