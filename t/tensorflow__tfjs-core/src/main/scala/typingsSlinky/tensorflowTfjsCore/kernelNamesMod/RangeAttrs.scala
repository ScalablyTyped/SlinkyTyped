package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeAttrs extends StObject {
  
  var dtype: float32 | int32 = js.native
  
  var start: Double = js.native
  
  var step: Double = js.native
  
  var stop: Double = js.native
}
object RangeAttrs {
  
  @scala.inline
  def apply(dtype: float32 | int32, start: Double, step: Double, stop: Double): RangeAttrs = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAttrs]
  }
  
  @scala.inline
  implicit class RangeAttrsMutableBuilder[Self <: RangeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtype(value: float32 | int32): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
