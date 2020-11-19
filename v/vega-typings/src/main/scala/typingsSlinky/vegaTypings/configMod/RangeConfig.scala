package typingsSlinky.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaTypings.encodeMod.SymbolShape
import typingsSlinky.vegaTypings.scaleMod.RangeRawArray
import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategoryVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: RangeScheme | js.Array[String]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDivergingVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = this.set("diverging", js.Array(value :_*))
    
    @scala.inline
    def setDiverging(value: RangeScheme | js.Array[String]): Self = this.set("diverging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiverging: Self = this.set("diverging", js.undefined)
    
    @scala.inline
    def setHeatmapVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = this.set("heatmap", js.Array(value :_*))
    
    @scala.inline
    def setHeatmap(value: RangeScheme | js.Array[String]): Self = this.set("heatmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatmap: Self = this.set("heatmap", js.undefined)
    
    @scala.inline
    def setOrdinalVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = this.set("ordinal", js.Array(value :_*))
    
    @scala.inline
    def setOrdinal(value: RangeScheme | js.Array[String]): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setRampVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = this.set("ramp", js.Array(value :_*))
    
    @scala.inline
    def setRamp(value: RangeScheme | js.Array[String]): Self = this.set("ramp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamp: Self = this.set("ramp", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: SymbolShape*): Self = this.set("symbol", js.Array(value :_*))
    
    @scala.inline
    def setSymbol(value: js.Array[SymbolShape]): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
}
