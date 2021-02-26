package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var grads: NamedTensorMap = js.native
  
  var value: Scalar = js.native
}
object Value {
  
  @scala.inline
  def apply(grads: NamedTensorMap, value: Scalar): Value = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrads(value: NamedTensorMap): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Scalar): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
