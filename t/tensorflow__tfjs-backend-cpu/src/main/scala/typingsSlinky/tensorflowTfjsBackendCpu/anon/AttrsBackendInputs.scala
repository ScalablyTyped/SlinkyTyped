package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.CastAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.CastInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsBackendInputs extends StObject {
  
  var attrs: CastAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: CastInputs = js.native
}
object AttrsBackendInputs {
  
  @scala.inline
  def apply(attrs: CastAttrs, backend: MathBackendCPU, inputs: CastInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit class AttrsBackendInputsMutableBuilder[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: CastAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: CastInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
