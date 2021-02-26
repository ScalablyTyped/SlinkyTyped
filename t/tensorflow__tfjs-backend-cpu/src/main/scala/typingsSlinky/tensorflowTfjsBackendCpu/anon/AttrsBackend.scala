package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.BatchMatMulAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.BatchMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsBackend extends StObject {
  
  var attrs: BatchMatMulAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: BatchMatMulInputs = js.native
}
object AttrsBackend {
  
  @scala.inline
  def apply(attrs: BatchMatMulAttrs, backend: MathBackendCPU, inputs: BatchMatMulInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  @scala.inline
  implicit class AttrsBackendMutableBuilder[Self <: AttrsBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: BatchMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: BatchMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
