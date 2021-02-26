package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grads[O /* <: Tensor[Rank] */] extends StObject {
  
  var grads: js.Array[Tensor[Rank]] = js.native
  
  var value: O = js.native
}
object Grads {
  
  @scala.inline
  def apply[O /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: O): Grads[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grads[O]]
  }
  
  @scala.inline
  implicit class GradsMutableBuilder[Self <: Grads[_], O /* <: Tensor[Rank] */] (val x: Self with Grads[O]) extends AnyVal {
    
    @scala.inline
    def setGrads(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "grads", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: O): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
