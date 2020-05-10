package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dDataAxisOption extends js.Object {
  var alignZeros: js.UndefOr[Boolean] = js.native
  var iconWidth: js.UndefOr[Double] = js.native
  var icons: js.UndefOr[Boolean] = js.native
  var labelOffsetX: js.UndefOr[Double] = js.native
  var labelOffsetY: js.UndefOr[Double] = js.native
  var left: js.UndefOr[DataAxisSideOption] = js.native
  var majorLinesOffset: js.UndefOr[Double] = js.native
  var minorLinesOffset: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.native
  var right: js.UndefOr[DataAxisSideOption] = js.native
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
}

object Graph2dDataAxisOption {
  @scala.inline
  def apply(): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
  @scala.inline
  implicit class Graph2dDataAxisOptionOps[Self <: Graph2dDataAxisOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignZeros(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignZeros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignZeros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignZeros")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: DataAxisSideOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorLinesOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorLinesOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorLinesOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorLinesOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorLinesOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorLinesOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorLinesOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorLinesOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: TimelineOptionsOrientationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: DataAxisSideOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMajorLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMajorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMajorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMajorLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinorLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinorLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

