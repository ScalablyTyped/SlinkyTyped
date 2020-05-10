package typingsSlinky.vegaTypings.layoutMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParams extends Layout {
  var align: js.UndefOr[LayoutAlign | SignalRef | RowColumn[LayoutAlign]] = js.native
  var bounds: js.UndefOr[LayoutBounds] = js.native
  var columns: js.UndefOr[Double | SignalRef] = js.native
  var footerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  var headerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  var offset: js.UndefOr[LayoutOffset] = js.native
  var padding: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  var titleAnchor: js.UndefOr[LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]] = js.native
  var titleBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
}

object LayoutParams {
  @scala.inline
  def apply(): LayoutParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutParams]
  }
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: LayoutAlign | SignalRef | RowColumn[LayoutAlign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LayoutBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterBand(value: Double | SignalRef | RowColumn[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerBand")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBand(value: Double | SignalRef | RowColumn[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBand")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: LayoutOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | SignalRef | RowColumn[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAnchor(value: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBand(value: Double | SignalRef | RowColumn[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBand")(js.undefined)
        ret
    }
  }
  
}

