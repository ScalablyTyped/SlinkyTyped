package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILine extends IAggregative {
  /** [Config Option] (Boolean) */
  var fillArea: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preciseStroke: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var smooth: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[Boolean] = js.native
}

object ILine {
  @scala.inline
  def apply(): ILine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILine]
  }
  @scala.inline
  implicit class ILineOps[Self <: ILine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillArea")(js.undefined)
        ret
    }
    @scala.inline
    def withPreciseStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preciseStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreciseStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preciseStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

