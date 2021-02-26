package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaTypings.legendMod.LegendOrient
import typingsSlinky.vegaTypings.legendMod.LegendType
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendConfig extends StObject {
  
  var legend: typingsSlinky.vegaLite.legendMod.Legend[SignalRef] = js.native
  
  var legendConfig: typingsSlinky.vegaLite.legendMod.LegendConfig[SignalRef] = js.native
  
  var legendType: LegendType = js.native
  
  var orient: LegendOrient = js.native
}
object LegendConfig {
  
  @scala.inline
  def apply(
    legend: typingsSlinky.vegaLite.legendMod.Legend[SignalRef],
    legendConfig: typingsSlinky.vegaLite.legendMod.LegendConfig[SignalRef],
    legendType: LegendType,
    orient: LegendOrient
  ): LegendConfig = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
  
  @scala.inline
  implicit class LegendConfigMutableBuilder[Self <: LegendConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegend(value: typingsSlinky.vegaLite.legendMod.Legend[SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendConfig(value: typingsSlinky.vegaLite.legendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
  }
}
