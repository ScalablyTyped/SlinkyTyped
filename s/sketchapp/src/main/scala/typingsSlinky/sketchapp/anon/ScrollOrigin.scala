package typingsSlinky.sketchapp.anon

import typingsSlinky.sketchapp.SketchMSCurvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOrigin extends js.Object {
  var scrollOrigin: SketchMSCurvePoint = js.native
  var zoomValue: Double = js.native
}

object ScrollOrigin {
  @scala.inline
  def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): ScrollOrigin = {
    val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOrigin]
  }
  @scala.inline
  implicit class ScrollOriginOps[Self <: ScrollOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollOrigin(value: SketchMSCurvePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

