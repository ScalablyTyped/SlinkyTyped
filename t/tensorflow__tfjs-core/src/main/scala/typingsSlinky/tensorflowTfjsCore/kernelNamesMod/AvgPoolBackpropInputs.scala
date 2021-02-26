package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input'> */
@js.native
trait AvgPoolBackpropInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.native
  
  var input: js.UndefOr[js.Any] = js.native
}
object AvgPoolBackpropInputs {
  
  @scala.inline
  def apply(): AvgPoolBackpropInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvgPoolBackpropInputs]
  }
  
  @scala.inline
  implicit class AvgPoolBackpropInputsMutableBuilder[Self <: AvgPoolBackpropInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
