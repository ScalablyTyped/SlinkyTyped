package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float16
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dtype extends StObject {
  
  var dtype: uint16 | uint8 | float16 = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object Dtype {
  
  @scala.inline
  def apply(dtype: uint16 | uint8 | float16): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
  
  @scala.inline
  implicit class DtypeMutableBuilder[Self <: Dtype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtype(value: uint16 | uint8 | float16): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
