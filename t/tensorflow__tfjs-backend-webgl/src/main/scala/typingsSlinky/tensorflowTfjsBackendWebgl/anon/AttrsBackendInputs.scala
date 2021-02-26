package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ConcatAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsBackendInputs extends StObject {
  
  var attrs: ConcatAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: ConcatInputs = js.native
}
object AttrsBackendInputs {
  
  @scala.inline
  def apply(attrs: ConcatAttrs, backend: MathBackendWebGL, inputs: ConcatInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit class AttrsBackendInputsMutableBuilder[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: ConcatAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ConcatInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
