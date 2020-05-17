package typingsSlinky.victory.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisLabel extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.native
  var axisLabel: js.UndefOr[CSSProperties] = js.native
  var grid: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
  var parent: js.UndefOr[CSSProperties] = js.native
  var tickLabels: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
  var ticks: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
}

object AxisLabel {
  @scala.inline
  def apply(): AxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabel]
  }
  @scala.inline
  implicit class AxisLabelOps[Self <: AxisLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabel(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: KinkeyofCSSPropertiesstri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLabels(value: KinkeyofCSSPropertiesstri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: KinkeyofCSSPropertiesstri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
  }
  
}

