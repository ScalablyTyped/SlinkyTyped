package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait MaxPoolInputs extends StObject {
  
  var x: js.UndefOr[js.Any] = js.native
}
object MaxPoolInputs {
  
  @scala.inline
  def apply(): MaxPoolInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPoolInputs]
  }
  
  @scala.inline
  implicit class MaxPoolInputsMutableBuilder[Self <: MaxPoolInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
