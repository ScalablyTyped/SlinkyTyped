package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthwiseConv2dNativeBackpropFilterAttrs extends StObject {
  
  var dilations: (js.Tuple2[Double, Double]) | Double = js.native
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  
  var filterShape: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var pad: valid_ | same_ | Double = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object DepthwiseConv2dNativeBackpropFilterAttrs {
  
  @scala.inline
  def apply(
    dilations: (js.Tuple2[Double, Double]) | Double,
    filterShape: js.Tuple4[Double, Double, Double, Double],
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): DepthwiseConv2dNativeBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(dilations = dilations.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class DepthwiseConv2dNativeBackpropFilterAttrsMutableBuilder[Self <: DepthwiseConv2dNativeBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    @scala.inline
    def setFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
