package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropFilterAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.DepthwiseConv2dNativeBackpropFilterInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsDepthwiseConv2dNativeBackpropFilterAttrs extends StObject {
  
  var attrs: DepthwiseConv2dNativeBackpropFilterAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: DepthwiseConv2dNativeBackpropFilterInputs = js.native
}
object AttrsDepthwiseConv2dNativeBackpropFilterAttrs {
  
  @scala.inline
  def apply(
    attrs: DepthwiseConv2dNativeBackpropFilterAttrs,
    backend: MathBackendCPU,
    inputs: DepthwiseConv2dNativeBackpropFilterInputs
  ): AttrsDepthwiseConv2dNativeBackpropFilterAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthwiseConv2dNativeBackpropFilterAttrs]
  }
  
  @scala.inline
  implicit class AttrsDepthwiseConv2dNativeBackpropFilterAttrsMutableBuilder[Self <: AttrsDepthwiseConv2dNativeBackpropFilterAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: DepthwiseConv2dNativeBackpropFilterAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: DepthwiseConv2dNativeBackpropFilterInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
