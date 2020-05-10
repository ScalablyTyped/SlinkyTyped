package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.encodeMod.Orientation
import typingsSlinky.vegaTypings.legendMod.BaseLegend
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendConfig extends BaseLegend {
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for gradient legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var gradientDirection: js.UndefOr[Orientation] = js.native
  /**
    * The maximum allowed length in pixels of color ramp gradient labels.
    */
  var gradientLabelLimit: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Vertical offset in pixels for color ramp gradient labels.
    *
    * __Default value:__ `2`.
    */
  var gradientLabelOffset: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Legend orient group layout parameters.
    */
  var layout: js.UndefOr[LegendLayout] = js.native
  /**
    * Border stroke dash pattern for the full legend.
    */
  var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.native
  /**
    * Border stroke width for the full legend.
    */
  var strokeWidth: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Default fill color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"transparent"`.
    */
  var symbolBaseFillColor: js.UndefOr[Null | Color | SignalRef] = js.native
  /**
    * Default stroke color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"gray"`.
    */
  var symbolBaseStrokeColor: js.UndefOr[Null | Color | SignalRef] = js.native
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var symbolDirection: js.UndefOr[Orientation] = js.native
}

object LegendConfig {
  @scala.inline
  def apply(): LegendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendConfig]
  }
  @scala.inline
  implicit class LegendConfigOps[Self <: LegendConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradientDirection(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientLabelLimit(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLabelLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientLabelLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLabelLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientLabelOffset(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLabelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLabelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: LegendLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDash(value: js.Array[Double] | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBaseFillColor(value: Color | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolBaseFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBaseFillColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseFillColor")(null)
        ret
    }
    @scala.inline
    def withSymbolBaseStrokeColor(value: Color | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolBaseStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBaseStrokeColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBaseStrokeColor")(null)
        ret
    }
    @scala.inline
    def withSymbolDirection(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDirection")(js.undefined)
        ret
    }
  }
  
}

