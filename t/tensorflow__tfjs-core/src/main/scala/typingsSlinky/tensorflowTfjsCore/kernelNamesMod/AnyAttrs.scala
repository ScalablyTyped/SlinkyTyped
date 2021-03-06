package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAttrs extends StObject {
  
  var axis: Double | js.Array[Double] = js.native
  
  var keepDims: Boolean = js.native
}
object AnyAttrs {
  
  @scala.inline
  def apply(axis: Double | js.Array[Double], keepDims: Boolean): AnyAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], keepDims = keepDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAttrs]
  }
  
  @scala.inline
  implicit class AnyAttrsMutableBuilder[Self <: AnyAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value :_*))
    
    @scala.inline
    def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
  }
}
