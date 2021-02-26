package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.BinaryInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsBinaryInputs extends StObject {
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: BinaryInputs = js.native
}
object InputsBinaryInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: BinaryInputs): InputsBinaryInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsBinaryInputs]
  }
  
  @scala.inline
  implicit class InputsBinaryInputsMutableBuilder[Self <: InputsBinaryInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: BinaryInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
