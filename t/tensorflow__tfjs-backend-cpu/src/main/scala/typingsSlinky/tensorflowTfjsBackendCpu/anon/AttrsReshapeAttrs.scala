package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ReshapeAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ReshapeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsReshapeAttrs extends StObject {
  
  var attrs: ReshapeAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: ReshapeInputs = js.native
}
object AttrsReshapeAttrs {
  
  @scala.inline
  def apply(attrs: ReshapeAttrs, backend: MathBackendCPU, inputs: ReshapeInputs): AttrsReshapeAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsReshapeAttrs]
  }
  
  @scala.inline
  implicit class AttrsReshapeAttrsMutableBuilder[Self <: AttrsReshapeAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: ReshapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ReshapeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
