package typingsSlinky.tensorflowTfjsBackendWebgl.anon

import typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropAttrs
import typingsSlinky.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsMaxPoolBackpropAttrs extends StObject {
  
  var attrs: MaxPoolBackpropAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: MaxPoolBackpropInputs = js.native
}
object AttrsMaxPoolBackpropAttrs {
  
  @scala.inline
  def apply(attrs: MaxPoolBackpropAttrs, backend: MathBackendWebGL, inputs: MaxPoolBackpropInputs): AttrsMaxPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolBackpropAttrs]
  }
  
  @scala.inline
  implicit class AttrsMaxPoolBackpropAttrsMutableBuilder[Self <: AttrsMaxPoolBackpropAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: MaxPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MaxPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
