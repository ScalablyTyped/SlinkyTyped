package typingsSlinky.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaTypings.encodeMod.SymbolShape
import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeConfig
  extends /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] {
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for categorical data.
    */
  var category: js.UndefOr[RangeScheme | js.Array[String]] = js.native
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for diverging quantitative ramps.
    */
  var diverging: js.UndefOr[RangeScheme | js.Array[String]] = js.native
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for quantitative heatmaps.
    */
  var heatmap: js.UndefOr[RangeScheme | js.Array[String]] = js.native
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for rank-ordered data.
    */
  var ordinal: js.UndefOr[RangeScheme | js.Array[String]] = js.native
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for sequential quantitative ramps.
    */
  var ramp: js.UndefOr[RangeScheme | js.Array[String]] = js.native
  /**
    * Array of [symbol](https://vega.github.io/vega/docs/marks/symbol/) names or paths for the default shape palette.
    */
  var symbol: js.UndefOr[js.Array[SymbolShape]] = js.native
}

object RangeConfig {
  @scala.inline
  def apply(): RangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeConfig]
  }
  @scala.inline
  implicit class RangeConfigOps[Self <: RangeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: RangeScheme | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDiverging(value: RangeScheme | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diverging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiverging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diverging")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatmap(value: RangeScheme | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: RangeScheme | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withRamp(value: RangeScheme | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramp")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: js.Array[SymbolShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
  }
  
}

