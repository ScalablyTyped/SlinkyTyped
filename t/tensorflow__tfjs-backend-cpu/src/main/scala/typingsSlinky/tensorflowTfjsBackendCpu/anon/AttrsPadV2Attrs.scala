package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.PadV2Attrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.PadV2Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsPadV2Attrs extends StObject {
  
  var attrs: PadV2Attrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: PadV2Inputs = js.native
}
object AttrsPadV2Attrs {
  
  @scala.inline
  def apply(attrs: PadV2Attrs, backend: MathBackendCPU, inputs: PadV2Inputs): AttrsPadV2Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsPadV2Attrs]
  }
  
  @scala.inline
  implicit class AttrsPadV2AttrsMutableBuilder[Self <: AttrsPadV2Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: PadV2Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: PadV2Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
