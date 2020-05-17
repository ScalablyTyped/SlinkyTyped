package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendOptions extends Graph2dLegendOption {
  var enabled: js.UndefOr[Boolean] = js.native
  var iconSize: js.UndefOr[Double] = js.native
  var iconSpacing: js.UndefOr[Double] = js.native
  var icons: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[LegendPositionOptions] = js.native
  var right: js.UndefOr[LegendPositionOptions] = js.native
}

object LegendOptions {
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSpacing")(js.undefined)
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
    def withLeft(value: LegendPositionOptions): Self = {
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
    def withRight(value: LegendPositionOptions): Self = {
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
  }
  
}

