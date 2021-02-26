package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.Conv3DBackpropInputInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConv3DBackpropInputAttrs extends StObject {
  
  var attrs: Conv3DBackpropInputAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: Conv3DBackpropInputInputs = js.native
}
object AttrsConv3DBackpropInputAttrs {
  
  @scala.inline
  def apply(attrs: Conv3DBackpropInputAttrs, backend: MathBackendCPU, inputs: Conv3DBackpropInputInputs): AttrsConv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConv3DBackpropInputAttrs]
  }
  
  @scala.inline
  implicit class AttrsConv3DBackpropInputAttrsMutableBuilder[Self <: AttrsConv3DBackpropInputAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Conv3DBackpropInputAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Conv3DBackpropInputInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
