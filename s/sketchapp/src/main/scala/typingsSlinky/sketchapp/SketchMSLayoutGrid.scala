package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.layoutGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayoutGrid extends SketchMSLayout {
  var _class: layoutGrid = js.native
  var columnWidth: Double = js.native
  var drawHorizontal: Boolean = js.native
  var drawHorizontalLines: Boolean = js.native
  var drawVertical: Boolean = js.native
  var gutterHeight: Double = js.native
  var gutterWidth: Double = js.native
  var guttersOutside: Boolean = js.native
  var horizontalOffset: Double = js.native
  var isEnabled: Boolean = js.native
  var numberOfColumns: Double = js.native
  var rowHeightMultiplication: Double = js.native
  var totalWidth: Double = js.native
}

object SketchMSLayoutGrid {
  @scala.inline
  def apply(
    _class: layoutGrid,
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
  @scala.inline
  implicit class SketchMSLayoutGridOps[Self <: SketchMSLayoutGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: layoutGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawHorizontalLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontalLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuttersOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guttersOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeightMultiplication(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeightMultiplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

