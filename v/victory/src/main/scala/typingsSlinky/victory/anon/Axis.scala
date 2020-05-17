package typingsSlinky.victory.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.native
  var axisLabel: js.UndefOr[CSSProperties] = js.native
  var grid: js.UndefOr[CSSProperties] = js.native
  var tickLabels: js.UndefOr[CSSProperties] = js.native
  var ticks: js.UndefOr[CSSProperties] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def withGrid(value: CSSProperties): Self = {
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
    def withTickLabels(value: CSSProperties): Self = {
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
    def withTicks(value: CSSProperties): Self = {
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

