package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
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
trait Conv2DBackpropFilterAttrs extends StObject {
  
  var dataFormat: NHWC | NCHW = js.native
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  
  var filterShape: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var pad: valid_ | same_ | Double | ExplicitPadding = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object Conv2DBackpropFilterAttrs {
  
  @scala.inline
  def apply(
    dataFormat: NHWC | NCHW,
    filterShape: js.Tuple4[Double, Double, Double, Double],
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): Conv2DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(dataFormat = dataFormat.asInstanceOf[js.Any], filterShape = filterShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv2DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class Conv2DBackpropFilterAttrsMutableBuilder[Self <: Conv2DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    @scala.inline
    def setFilterShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
