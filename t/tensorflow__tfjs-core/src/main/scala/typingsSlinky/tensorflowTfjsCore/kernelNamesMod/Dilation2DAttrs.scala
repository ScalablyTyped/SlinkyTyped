package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dilation2DAttrs extends StObject {
  
  var dilations: (js.Tuple2[Double, Double]) | Double = js.native
  
  var pad: valid_ | same_ | Double = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object Dilation2DAttrs {
  
  @scala.inline
  def apply(
    dilations: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): Dilation2DAttrs = {
    val __obj = js.Dynamic.literal(dilations = dilations.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dilation2DAttrs]
  }
  
  @scala.inline
  implicit class Dilation2DAttrsMutableBuilder[Self <: Dilation2DAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
