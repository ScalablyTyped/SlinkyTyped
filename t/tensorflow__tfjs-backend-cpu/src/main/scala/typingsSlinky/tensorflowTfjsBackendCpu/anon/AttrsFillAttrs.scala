package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.FillAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsFillAttrs extends StObject {
  
  var attrs: FillAttrs = js.native
  
  var backend: MathBackendCPU = js.native
}
object AttrsFillAttrs {
  
  @scala.inline
  def apply(attrs: FillAttrs, backend: MathBackendCPU): AttrsFillAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsFillAttrs]
  }
  
  @scala.inline
  implicit class AttrsFillAttrsMutableBuilder[Self <: AttrsFillAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FillAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
  }
}
