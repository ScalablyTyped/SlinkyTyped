package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.RealInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsRealInputs extends js.Object {
  
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
  implicit class InputsRealInputsOps[Self <: InputsRealInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: RealInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
