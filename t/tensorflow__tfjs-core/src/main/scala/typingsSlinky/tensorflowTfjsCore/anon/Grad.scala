package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends StObject {
  
  var grad: I = js.native
  
  var value: O = js.native
}
object Grad {
  
  @scala.inline
  def apply[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */](grad: I, value: O): Grad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grad[O, I]]
  }
  
  @scala.inline
  implicit class GradMutableBuilder[Self <: Grad[_, _], O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] (val x: Self with (Grad[O, I])) extends AnyVal {
    
    @scala.inline
    def setGrad(value: I): Self = StObject.set(x, "grad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: O): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
