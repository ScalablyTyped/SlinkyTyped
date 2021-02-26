package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'input'> */
@js.native
trait FFTInputs extends StObject {
  
  var input: js.UndefOr[js.Any] = js.native
}
object FFTInputs {
  
  @scala.inline
  def apply(): FFTInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FFTInputs]
  }
  
  @scala.inline
  implicit class FFTInputsMutableBuilder[Self <: FFTInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
