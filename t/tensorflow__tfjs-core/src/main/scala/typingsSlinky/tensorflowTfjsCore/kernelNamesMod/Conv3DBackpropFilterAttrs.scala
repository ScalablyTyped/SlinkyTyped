package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conv3DBackpropFilterAttrs extends StObject {
  
  var filterShape: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  
  var pad: valid_ | same_ = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object Conv3DBackpropFilterAttrs {
  
  @scala.inline
  def apply(
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    pad: valid_ | same_,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): Conv3DBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(filterShape = filterShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class Conv3DBackpropFilterAttrsMutableBuilder[Self <: Conv3DBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterShape(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "filterShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
