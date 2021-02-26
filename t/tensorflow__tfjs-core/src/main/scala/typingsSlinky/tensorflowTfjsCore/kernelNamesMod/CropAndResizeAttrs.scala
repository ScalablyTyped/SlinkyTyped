package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropAndResizeAttrs extends StObject {
  
  var cropSize: js.Tuple2[Double, Double] = js.native
  
  var extrapolationValue: Double = js.native
  
  var method: bilinear | nearest = js.native
}
object CropAndResizeAttrs {
  
  @scala.inline
  def apply(cropSize: js.Tuple2[Double, Double], extrapolationValue: Double, method: bilinear | nearest): CropAndResizeAttrs = {
    val __obj = js.Dynamic.literal(cropSize = cropSize.asInstanceOf[js.Any], extrapolationValue = extrapolationValue.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropAndResizeAttrs]
  }
  
  @scala.inline
  implicit class CropAndResizeAttrsMutableBuilder[Self <: CropAndResizeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "cropSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolationValue(value: Double): Self = StObject.set(x, "extrapolationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: bilinear | nearest): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
