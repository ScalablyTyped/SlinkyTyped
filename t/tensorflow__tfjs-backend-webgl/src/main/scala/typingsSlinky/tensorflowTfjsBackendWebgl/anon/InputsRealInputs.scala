package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.RealInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsRealInputs extends StObject {
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: RealInputs = js.native
}
object InputsRealInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: RealInputs): InputsRealInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsRealInputs]
  }
  
  @scala.inline
  implicit class InputsRealInputsMutableBuilder[Self <: InputsRealInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: RealInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
