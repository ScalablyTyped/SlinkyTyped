package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedMatMulAttrs extends StObject {
  
  var activation: Activation = js.native
  
  var transposeA: Boolean = js.native
  
  var transposeB: Boolean = js.native
}
object FusedMatMulAttrs {
  
  @scala.inline
  def apply(activation: Activation, transposeA: Boolean, transposeB: Boolean): FusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulAttrs]
  }
  
  @scala.inline
  implicit class FusedMatMulAttrsMutableBuilder[Self <: FusedMatMulAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
  }
}
