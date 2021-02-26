package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendInputs extends StObject {
  
  var attrs: FusedBatchNormAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: FusedBatchNormInputs = js.native
}
object BackendInputs {
  
  @scala.inline
  def apply(attrs: FusedBatchNormAttrs, backend: MathBackendCPU, inputs: FusedBatchNormInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  @scala.inline
  implicit class BackendInputsMutableBuilder[Self <: BackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedBatchNormAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedBatchNormInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
