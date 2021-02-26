package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channelMod.NonPositionScaleChannel
import typingsSlinky.vegaLite.legendMod.LegendInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends StObject {
  
  var channel: NonPositionScaleChannel = js.native
  
  var legend: LegendInternal = js.native
  
  var scaleType: typingsSlinky.vegaLite.scaleMod.ScaleType = js.native
  
  var timeUnit: js.UndefOr[typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit] = js.native
}
object Legend {
  
  @scala.inline
  def apply(
    channel: NonPositionScaleChannel,
    legend: LegendInternal,
    scaleType: typingsSlinky.vegaLite.scaleMod.ScaleType
  ): Legend = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  @scala.inline
  implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: LegendInternal): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleType(value: typingsSlinky.vegaLite.scaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
