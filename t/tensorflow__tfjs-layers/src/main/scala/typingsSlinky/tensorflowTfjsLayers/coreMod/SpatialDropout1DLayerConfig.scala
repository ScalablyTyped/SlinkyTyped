package typingsSlinky.tensorflowTfjsLayers.coreMod

import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialDropout1DLayerConfig extends LayerConfig {
  
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double = js.native
  
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.native
}
object SpatialDropout1DLayerConfig {
  
  @scala.inline
  def apply(rate: Double): SpatialDropout1DLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialDropout1DLayerConfig]
  }
  
  @scala.inline
  implicit class SpatialDropout1DLayerConfigMutableBuilder[Self <: SpatialDropout1DLayerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
