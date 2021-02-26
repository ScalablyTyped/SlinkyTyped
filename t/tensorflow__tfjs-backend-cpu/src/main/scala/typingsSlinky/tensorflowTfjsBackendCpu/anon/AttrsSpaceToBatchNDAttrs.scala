package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.SpaceToBatchNDAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.SpaceToBatchNDInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsSpaceToBatchNDAttrs extends StObject {
  
  var attrs: SpaceToBatchNDAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: SpaceToBatchNDInputs = js.native
}
object AttrsSpaceToBatchNDAttrs {
  
  @scala.inline
  def apply(attrs: SpaceToBatchNDAttrs, backend: MathBackendCPU, inputs: SpaceToBatchNDInputs): AttrsSpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsSpaceToBatchNDAttrs]
  }
  
  @scala.inline
  implicit class AttrsSpaceToBatchNDAttrsMutableBuilder[Self <: AttrsSpaceToBatchNDAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: SpaceToBatchNDAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: SpaceToBatchNDInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
