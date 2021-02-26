package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.FFTInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendMathBackendWebGL extends StObject {
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: FFTInputs = js.native
}
object BackendMathBackendWebGL {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: FFTInputs): BackendMathBackendWebGL = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMathBackendWebGL]
  }
  
  @scala.inline
  implicit class BackendMathBackendWebGLMutableBuilder[Self <: BackendMathBackendWebGL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FFTInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
