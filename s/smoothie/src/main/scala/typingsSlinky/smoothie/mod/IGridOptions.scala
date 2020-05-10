package typingsSlinky.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /** Whether the grid lines trace the border of the chart or not. */
  var borderVisible: js.UndefOr[Boolean] = js.native
  /** The background colour of the chart. */
  var fillStyle: js.UndefOr[String] = js.native
  /** The pixel width of grid lines. */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Distance between vertical grid lines. */
  var millisPerLine: js.UndefOr[Double] = js.native
  /** Controls whether grid lines are 1px sharp, or softened. */
  var sharpLines: js.UndefOr[Boolean] = js.native
  /** Colour of grid lines. */
  var strokeStyle: js.UndefOr[String] = js.native
  /** Number of vertical sections marked out by horizontal grid lines. */
  var verticalSections: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withFillStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisPerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisPerLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisPerLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSharpLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharpLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpLines")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSections")(js.undefined)
        ret
    }
  }
  
}

