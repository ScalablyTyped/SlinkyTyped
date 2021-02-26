package typingsSlinky.tensorflowTfjsBackendCpu.anon

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.FFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsFFTInputs extends StObject {
  
  var backend: MathBackendCPU = js.native
  
  var inputs: FFTInputs = js.native
}
object InputsFFTInputs {
  
  @scala.inline
  def apply(backend: MathBackendCPU, inputs: FFTInputs): InputsFFTInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsFFTInputs]
  }
  
  @scala.inline
  implicit class InputsFFTInputsMutableBuilder[Self <: InputsFFTInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
