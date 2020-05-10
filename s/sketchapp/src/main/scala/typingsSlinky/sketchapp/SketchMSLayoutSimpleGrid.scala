package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.simpleGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayoutSimpleGrid extends SketchMSLayout {
  var _class: simpleGrid = js.native
  var gridSize: Double = js.native
  var isEnabled: Double = js.native
  var thickGridTimes: Double = js.native
}

object SketchMSLayoutSimpleGrid {
  @scala.inline
  def apply(_class: simpleGrid, gridSize: Double, isEnabled: Double, thickGridTimes: Double): SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
  @scala.inline
  implicit class SketchMSLayoutSimpleGridOps[Self <: SketchMSLayoutSimpleGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: simpleGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickGridTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickGridTimes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

