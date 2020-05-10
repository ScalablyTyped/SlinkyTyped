package typingsSlinky.vegaTypings.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendLayout extends BaseLegendLayout {
  var bottom: js.UndefOr[BaseLegendLayout] = js.native
  var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.native
  var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.native
  var left: js.UndefOr[BaseLegendLayout] = js.native
  var right: js.UndefOr[BaseLegendLayout] = js.native
  var top: js.UndefOr[BaseLegendLayout] = js.native
  var `top-left`: js.UndefOr[BaseLegendLayout] = js.native
  var `top-right`: js.UndefOr[BaseLegendLayout] = js.native
}

object LegendLayout {
  @scala.inline
  def apply(): LegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayout]
  }
  @scala.inline
  implicit class LegendLayoutOps[Self <: LegendLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-left`(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-right`(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-right")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: BaseLegendLayout): Self = {
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
    def withRight(value: BaseLegendLayout): Self = {
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
    def withTop(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-left`(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-right`(value: BaseLegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-right")(js.undefined)
        ret
    }
  }
  
}

