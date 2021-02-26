package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.ComplexInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendInputs extends StObject {
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: ComplexInputs = js.native
}
object BackendInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: ComplexInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  @scala.inline
  implicit class BackendInputsMutableBuilder[Self <: BackendInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ComplexInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
